/**
 * This file was auto-generated by Fern from our API Definition.
 */

import * as serializers from "../../../index";
import * as SeedTrace from "../../../../api/index";
import * as core from "../../../../core";
import { WorkspaceSubmissionUpdateInfo } from "./WorkspaceSubmissionUpdateInfo";

export const WorkspaceSubmissionUpdate: core.serialization.ObjectSchema<
    serializers.WorkspaceSubmissionUpdate.Raw,
    SeedTrace.WorkspaceSubmissionUpdate
> = core.serialization.object({
    updateTime: core.serialization.date(),
    updateInfo: WorkspaceSubmissionUpdateInfo,
});

export declare namespace WorkspaceSubmissionUpdate {
    export interface Raw {
        updateTime: string;
        updateInfo: WorkspaceSubmissionUpdateInfo.Raw;
    }
}
