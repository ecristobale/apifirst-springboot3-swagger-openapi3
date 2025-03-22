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

public class Greetings {
    @Nullable
    private String hi;

    public Greetings() {
    }

    public Greetings hi(String hi) {
        this.hi = hi;
        return this;
    }

    @Schema(
            name = "hi",
            requiredMode = RequiredMode.NOT_REQUIRED
    )
    @JsonProperty("hi")
    public String getHi() {
        return this.hi;
    }

    public void setHi(String hi) {
        this.hi = hi;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Greetings greetings = (Greetings)o;
            return Objects.equals(this.hi, greetings.hi);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.hi});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Greetings {\n");
        sb.append("    hi: ").append(this.toIndentedString(this.hi)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
