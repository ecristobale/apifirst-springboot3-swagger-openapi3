//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.ecristobale.apifirstdev.api;

import com.ecristobale.apifirstdev.model.GreetingNotFoundError;
import com.ecristobale.apifirstdev.model.Greetings;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

@Validated
@Tag(
        name = "greetings",
        description = "Simple greetings actions"
)
public interface GreetingsApi {
    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @Operation(
            operationId = "getGreetings",
            summary = "Get greetings summary",
            description = "Get greetings description",
            tags = {"greetings"},
            responses = {@ApiResponse(
                    responseCode = "200",
                    description = "Success",
                    content = {@Content(
                            mediaType = "application/json",
                            schema = @Schema(
                                    implementation = Greetings.class
                            )
                    )}
            ), @ApiResponse(
                    responseCode = "404",
                    description = "No greetings found",
                    content = {@Content(
                            mediaType = "application/json",
                            schema = @Schema(
                                    implementation = GreetingNotFoundError.class
                            )
                    )}
            )}
    )
    @RequestMapping(
            method = {RequestMethod.GET},
            value = {"/greetings"},
            produces = {"application/json"}
    )
    default ResponseEntity<Greetings> getGreetings() {
        this.getRequest().ifPresent((request) -> {
            for(MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"hi\" : \"hi\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }

                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }

        });
        return new ResponseEntity(HttpStatus.NOT_IMPLEMENTED);
    }
}
