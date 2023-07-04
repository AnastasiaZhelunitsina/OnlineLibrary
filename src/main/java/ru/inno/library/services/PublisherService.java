package ru.inno.library.services;

import ru.inno.library.dto.PublisherForm;
import ru.inno.library.models.Publisher;

public interface PublisherService {

    public void deletePublisher(Long id);

    void updatePublisher(Long publisherId, PublisherForm publisher);

    Object getPublishers();

    Publisher getPublisher(Long publisherId);

    void addPublisher(PublisherForm publisher);
}