package random.sfgrestdocsexample.web.mappers;

import org.mapstruct.Mapper;
import random.sfgrestdocsexample.domain.Beer;
import random.sfgrestdocsexample.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
