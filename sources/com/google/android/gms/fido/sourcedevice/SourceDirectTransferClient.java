package com.google.android.gms.fido.sourcedevice;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public interface SourceDirectTransferClient extends HasApiKey<Api.ApiOptions.NoOptions> {

    @NonNull
    public static final String KEY_SOURCE_DIRECT_TRANSFER_RESULT = "source_direct_transfer_result";

    @NonNull
    SourceDirectTransferResult getSourceDirectTransferResultFromIntent(@Nullable Intent intent) throws ApiException;

    @NonNull
    Task<PendingIntent> startDirectTransfer(@NonNull SourceStartDirectTransferOptions sourceStartDirectTransferOptions, @NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull ParcelFileDescriptor parcelFileDescriptor2);
}
