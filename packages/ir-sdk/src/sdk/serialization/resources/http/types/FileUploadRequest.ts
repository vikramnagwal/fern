/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as FernIr from "../../../../api/index";
import * as core from "../../../../core";
import { Name } from "../../commons/types/Name";
import { FileUploadRequestProperty } from "./FileUploadRequestProperty";
import { WithDocs } from "../../commons/types/WithDocs";
import { WithV2Examples } from "../../examples/types/WithV2Examples";

export const FileUploadRequest: core.serialization.ObjectSchema<
    serializers.FileUploadRequest.Raw,
    FernIr.FileUploadRequest
> = core.serialization
    .objectWithoutOptionalProperties({
        name: Name,
        properties: core.serialization.list(FileUploadRequestProperty),
    })
    .extend(WithDocs)
    .extend(WithV2Examples);

export declare namespace FileUploadRequest {
    export interface Raw extends WithDocs.Raw, WithV2Examples.Raw {
        name: Name.Raw;
        properties: FileUploadRequestProperty.Raw[];
    }
}
