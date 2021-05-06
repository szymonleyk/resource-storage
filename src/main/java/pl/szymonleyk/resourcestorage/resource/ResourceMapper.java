package pl.szymonleyk.resourcestorage.resource;

public class ResourceMapper {

    public static Resource mapToResource(ResourceDto resourceDto) {
        return new Resource(resourceDto.getId(), resourceDto.getUrl());
    }

    public static ResourceDto mapToResourceDto(Resource resource) {
        return new ResourceDto(resource.getId(), resource.getUrl());
    }
}
