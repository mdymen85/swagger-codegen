package com.example.codegen.api;

import com.example.codegen.model.TestGet400Response;
import com.example.codegen.model.TestGet404Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link V1ApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-21T16:11:34.074008402-03:00[America/Sao_Paulo]")
public interface V1ApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /v1/test/{number} : this is summary
     * simple get
     *
     * @param number number test tag (required)
     * @return Success (status code 200)
     *         or The required parameter is missing or invalid (status code 400)
     *         or Route not found (status code 404)
     * @see V1Api#testGet
     */
    default ResponseEntity<Integer> testGet(Integer number) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
