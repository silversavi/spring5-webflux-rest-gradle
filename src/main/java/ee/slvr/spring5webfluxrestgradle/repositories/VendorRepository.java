package ee.slvr.spring5webfluxrestgradle.repositories;


import ee.slvr.spring5webfluxrestgradle.domain.Vendor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
}
