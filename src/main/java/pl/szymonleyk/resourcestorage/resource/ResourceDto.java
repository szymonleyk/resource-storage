package pl.szymonleyk.resourcestorage.resource;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResourceDto {
    private Long id;
    private String url;
}
