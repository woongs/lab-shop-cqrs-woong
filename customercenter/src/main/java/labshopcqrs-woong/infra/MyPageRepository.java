package labshopcqrs-woong.infra;

import labshopcqrs-woong.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="myPages", path="myPages")
public interface MyPageRepository extends PagingAndSortingRepository<MyPage, Long> {

    List<MyPage> findByOrderId(Long orderId);


    
}
