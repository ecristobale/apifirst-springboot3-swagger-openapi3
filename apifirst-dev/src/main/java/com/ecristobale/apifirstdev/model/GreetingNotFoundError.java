//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.ecristobale.apifirstdev.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.Objects;
import org.springframework.lang.Nullable;

public class GreetingNotFoundError {
    @Nullable
    private String message;

    public GreetingNotFoundError() {
    }

    public GreetingNotFoundError message(String message) {
        this.message = message;
        return this;
    }

    @Schema(
            name = "message",
            requiredMode = RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("message")
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            GreetingNotFoundError greetingNotFoundError = (GreetingNotFoundError)o;
            return Objects.equals(this.message, greetingNotFoundError.message);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.message});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GreetingNotFoundError {\n");
        sb.append("    message: ").append(this.toIndentedString(this.message)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
