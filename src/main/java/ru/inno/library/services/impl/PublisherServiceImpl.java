package ru.inno.library.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.inno.library.dto.PublisherForm;
import ru.inno.library.models.Publisher;
import ru.inno.library.repositories.PublisherRepository;
import ru.inno.library.services.PublisherService;

import java.util.List;


@RequiredArgsConstructor
@Service
public class PublisherServiceImpl implements PublisherService {

    private final PublisherRepository publisherRepository;

    @Override
    public List<Publisher> getPublishers() {
        return publisherRepository.findAllByStateNot(Publisher.State.DELETED);
    }

    @Override
    public Publisher getPublisher(Long publisherId) {
        return publisherRepository.findById(publisherId).orElseThrow();
    }

    @Override
    public void addPublisher(PublisherForm publisher) {
        Publisher newPublisher = Publisher.builder()
                .name(publisher.getName())
                .state(Publisher.State.CONFIRMED)
                .build();

        publisherRepository.save(newPublisher);
    }

    @Override
    public void updatePublisher(Long publisherId, PublisherForm publisherForm) {
        Publisher publisherForUpdate = publisherRepository.findById(publisherId).orElseThrow();
        publisherForUpdate.setName(publisherForm.getName());

        publisherRepository.save(publisherForUpdate);
    }

    @Override
    public void deletePublisher(Long publisherId) {
        Publisher publisherForDelete = publisherRepository.findById(publisherId).orElseThrow();
        publisherForDelete.setState(Publisher.State.DELETED);

        publisherRepository.save(publisherForDelete);
    }
}