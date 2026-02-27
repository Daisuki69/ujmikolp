package com.google.android.gms.internal.fido;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.sourcedevice.SourceDirectTransferClient;
import com.google.android.gms.fido.sourcedevice.SourceDirectTransferResult;
import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public final class zzy extends GoogleApi implements SourceDirectTransferClient {
    private static final Api.ClientKey zza;
    private static final Api zzb;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzb = new Api("Fido.FIDO_SOURCE_DIRECT_TRANSFER_API", new zzz(), clientKey);
    }

    public zzy(Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) zzb, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.fido.sourcedevice.SourceDirectTransferClient
    public final SourceDirectTransferResult getSourceDirectTransferResultFromIntent(@Nullable Intent intent) throws ApiException {
        if (intent == null) {
            throw new ApiException(Status.RESULT_INTERNAL_ERROR);
        }
        SourceDirectTransferResult sourceDirectTransferResult = (SourceDirectTransferResult) SafeParcelableSerializer.deserializeFromIntentExtra(intent, SourceDirectTransferClient.KEY_SOURCE_DIRECT_TRANSFER_RESULT, SourceDirectTransferResult.CREATOR);
        if (sourceDirectTransferResult != null) {
            return sourceDirectTransferResult;
        }
        throw new ApiException(Status.RESULT_INTERNAL_ERROR);
    }

    @Override // com.google.android.gms.fido.sourcedevice.SourceDirectTransferClient
    public final Task<PendingIntent> startDirectTransfer(final SourceStartDirectTransferOptions sourceStartDirectTransferOptions, final ParcelFileDescriptor parcelFileDescriptor, final ParcelFileDescriptor parcelFileDescriptor2) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.fido.zzw
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzy zzyVar = this.zza;
                SourceStartDirectTransferOptions sourceStartDirectTransferOptions2 = sourceStartDirectTransferOptions;
                ParcelFileDescriptor parcelFileDescriptor3 = parcelFileDescriptor;
                ParcelFileDescriptor parcelFileDescriptor4 = parcelFileDescriptor2;
                ((zzt) ((zzaa) obj).getService()).zzc(new zzx(zzyVar, (TaskCompletionSource) obj2), sourceStartDirectTransferOptions2, parcelFileDescriptor3, parcelFileDescriptor4);
            }
        }).setMethodKey(5421).build());
    }

    public zzy(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) zzb, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
