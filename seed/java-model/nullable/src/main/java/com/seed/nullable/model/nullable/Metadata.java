/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.nullable.model.nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seed.nullable.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Metadata.Builder.class)
public final class Metadata {
    private final OffsetDateTime createdAt;

    private final OffsetDateTime updatedAt;

    private final Optional<String> avatar;

    private final Optional<Boolean> activated;

    private final Status status;

    private final Optional<Map<String, Optional<String>>> values;

    private Metadata(
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Optional<String> avatar,
            Optional<Boolean> activated,
            Status status,
            Optional<Map<String, Optional<String>>> values) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.avatar = avatar;
        this.activated = activated;
        this.status = status;
        this.values = values;
    }

    @JsonProperty("createdAt")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("updatedAt")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("avatar")
    public Optional<String> getAvatar() {
        return avatar;
    }

    @JsonProperty("activated")
    public Optional<Boolean> getActivated() {
        return activated;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("values")
    public Optional<Map<String, Optional<String>>> getValues() {
        return values;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Metadata && equalTo((Metadata) other);
    }

    private boolean equalTo(Metadata other) {
        return createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt)
                && avatar.equals(other.avatar)
                && activated.equals(other.activated)
                && status.equals(other.status)
                && values.equals(other.values);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.createdAt, this.updatedAt, this.avatar, this.activated, this.status, this.values);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CreatedAtStage builder() {
        return new Builder();
    }

    public interface CreatedAtStage {
        UpdatedAtStage createdAt(OffsetDateTime createdAt);

        Builder from(Metadata other);
    }

    public interface UpdatedAtStage {
        StatusStage updatedAt(OffsetDateTime updatedAt);
    }

    public interface StatusStage {
        _FinalStage status(Status status);
    }

    public interface _FinalStage {
        Metadata build();

        _FinalStage avatar(Optional<String> avatar);

        _FinalStage avatar(String avatar);

        _FinalStage activated(Optional<Boolean> activated);

        _FinalStage activated(Boolean activated);

        _FinalStage values(Optional<Map<String, Optional<String>>> values);

        _FinalStage values(Map<String, Optional<String>> values);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CreatedAtStage, UpdatedAtStage, StatusStage, _FinalStage {
        private OffsetDateTime createdAt;

        private OffsetDateTime updatedAt;

        private Status status;

        private Optional<Map<String, Optional<String>>> values = Optional.empty();

        private Optional<Boolean> activated = Optional.empty();

        private Optional<String> avatar = Optional.empty();

        private Builder() {}

        @java.lang.Override
        public Builder from(Metadata other) {
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            avatar(other.getAvatar());
            activated(other.getActivated());
            status(other.getStatus());
            values(other.getValues());
            return this;
        }

        @java.lang.Override
        @JsonSetter("createdAt")
        public UpdatedAtStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt, "createdAt must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("updatedAt")
        public StatusStage updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt, "updatedAt must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("status")
        public _FinalStage status(Status status) {
            this.status = Objects.requireNonNull(status, "status must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage values(Map<String, Optional<String>> values) {
            this.values = Optional.ofNullable(values);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "values", nulls = Nulls.SKIP)
        public _FinalStage values(Optional<Map<String, Optional<String>>> values) {
            this.values = values;
            return this;
        }

        @java.lang.Override
        public _FinalStage activated(Boolean activated) {
            this.activated = Optional.ofNullable(activated);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "activated", nulls = Nulls.SKIP)
        public _FinalStage activated(Optional<Boolean> activated) {
            this.activated = activated;
            return this;
        }

        @java.lang.Override
        public _FinalStage avatar(String avatar) {
            this.avatar = Optional.ofNullable(avatar);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "avatar", nulls = Nulls.SKIP)
        public _FinalStage avatar(Optional<String> avatar) {
            this.avatar = avatar;
            return this;
        }

        @java.lang.Override
        public Metadata build() {
            return new Metadata(createdAt, updatedAt, avatar, activated, status, values);
        }
    }
}
