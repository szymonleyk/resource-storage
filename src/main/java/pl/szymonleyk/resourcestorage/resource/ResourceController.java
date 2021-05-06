package pl.szymonleyk.resourcestorage.resource;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping("/resources")
public class ResourceController {

    private final ResourceService resourceService;

    @GetMapping
    public List<ResourceDto> getAll(){
        return resourceService.getAll().stream().map(ResourceMapper::mapToResourceDto).collect(Collectors.toList());
    }

    @PostMapping
    public void addResource(@RequestBody ResourceDto resourceDto){
        resourceService.add(ResourceMapper.mapToResource(resourceDto));
    }
}
