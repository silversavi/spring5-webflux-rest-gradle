package ee.slvr.spring5webfluxrestgradle.repositories;

import ee.slvr.spring5webfluxrestgradle.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {
}
