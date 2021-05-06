package pl.szymonleyk.resourcestorage.resource;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class ResourceService {

    private final ResourceRepository resourceRepository;

    public List<Resource> getAll(){
        return resourceRepository.findAll();
    }

    public void add(Resource resource) {
        resourceRepository.save(resource);
    }
}
