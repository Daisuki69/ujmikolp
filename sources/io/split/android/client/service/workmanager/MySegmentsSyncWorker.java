package io.split.android.client.service.workmanager;

import Ri.a;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import java.net.URISyntaxException;
import java.util.Collections;
import ki.i;

/* JADX INFO: loaded from: classes4.dex */
public class MySegmentsSyncWorker extends BaseSegmentsSyncWorker {
    public MySegmentsSyncWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        String[] stringArray = workerParameters.getInputData().getStringArray("key");
        String string = workerParameters.getInputData().getString("apiKey");
        boolean z4 = workerParameters.getInputData().getBoolean("encryptionEnabled", false);
        boolean z5 = workerParameters.getInputData().getBoolean("shouldRecordTelemetry", false);
        try {
            if (stringArray == null) {
                a.g("Error scheduling segments sync worker: Keys are null");
            } else {
                this.f17614d = new i(Collections.unmodifiableSet(BaseSegmentsSyncWorker.b(stringArray, z5, this.f17613b, this.c, this.f17612a, string, z4)));
            }
        } catch (URISyntaxException e) {
            a.g("Error creating Split worker: " + e.getMessage());
        }
    }
}
