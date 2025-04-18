/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as SeedPagination from "../../../../api/index";
import * as core from "../../../../core";

export const ListUsersPaginationResponse: core.serialization.ObjectSchema<
    serializers.ListUsersPaginationResponse.Raw,
    SeedPagination.ListUsersPaginationResponse
> = core.serialization.object({
    hasNextPage: core.serialization.boolean().optional(),
    page: core.serialization.lazyObject(() => serializers.Page).optional(),
    totalCount: core.serialization.property("total_count", core.serialization.number()),
    data: core.serialization.list(core.serialization.lazyObject(() => serializers.User)),
});

export declare namespace ListUsersPaginationResponse {
    export interface Raw {
        hasNextPage?: boolean | null;
        page?: serializers.Page.Raw | null;
        total_count: number;
        data: serializers.User.Raw[];
    }
}
