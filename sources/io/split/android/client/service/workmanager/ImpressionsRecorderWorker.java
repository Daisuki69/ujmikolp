package io.split.android.client.service.workmanager;

import D.S;
import Ri.a;
import U8.c;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import io.split.android.client.network.b;
import io.split.android.client.storage.db.StorageFactory;
import java.net.URISyntaxException;
import ji.C1684a;
import mi.InterfaceC1866a;
import oi.C1989g;

/* JADX INFO: loaded from: classes4.dex */
public class ImpressionsRecorderWorker extends SplitWorker {
    public ImpressionsRecorderWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        try {
            int i = workerParameters.getInputData().getInt("impressionsPerPush", 100);
            boolean z4 = workerParameters.getInputData().getBoolean("shouldRecordTelemetry", false);
            this.f17614d = new C1684a(new c(this.f17613b, b.a(this.c, "/testImpressions/bulk", null), (InterfaceC1866a) new C1989g()), StorageFactory.getPersistentImpressionsStorageForWorker(this.f17612a, workerParameters.getInputData().getString("apiKey"), workerParameters.getInputData().getBoolean("encryptionEnabled", false)), new S(i, z4), StorageFactory.getTelemetryStorage(z4));
        } catch (URISyntaxException e) {
            a.g("Error creating Split worker: " + e.getMessage());
        }
    }
}
