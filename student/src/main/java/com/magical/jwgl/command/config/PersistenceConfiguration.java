package com.magical.jwgl.command.config;

import com.magical.jwgl.command.aggregates.Student;
import org.axonframework.commandhandling.model.Repository;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Edison on 2017/3/28.
 */
@Configuration
public class PersistenceConfiguration {

    @Bean(name = "studentRepository")
    public Repository<Student> repository(EventStore eventStore){
        return new EventSourcingRepository<Student>(Student.class, eventStore);
    }
}
