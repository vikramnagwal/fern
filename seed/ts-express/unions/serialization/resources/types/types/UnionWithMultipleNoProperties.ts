/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as SeedUnions from "../../../../api/index";
import * as core from "../../../../core";

export const UnionWithMultipleNoProperties: core.serialization.Schema<
    serializers.UnionWithMultipleNoProperties.Raw,
    SeedUnions.UnionWithMultipleNoProperties
> = core.serialization
    .union("type", {
        foo: core.serialization.lazyObject(() => serializers.Foo),
        empty1: core.serialization.object({}),
        empty2: core.serialization.object({}),
    })
    .transform<SeedUnions.UnionWithMultipleNoProperties>({
        transform: (value) => value,
        untransform: (value) => value,
    });

export declare namespace UnionWithMultipleNoProperties {
    export type Raw =
        | UnionWithMultipleNoProperties.Foo
        | UnionWithMultipleNoProperties.Empty1
        | UnionWithMultipleNoProperties.Empty2;

    export interface Foo extends serializers.Foo.Raw {
        type: "foo";
    }

    export interface Empty1 {
        type: "empty1";
    }

    export interface Empty2 {
        type: "empty2";
    }
}
