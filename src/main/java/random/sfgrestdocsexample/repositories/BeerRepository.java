package random.sfgrestdocsexample.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;
import random.sfgrestdocsexample.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
