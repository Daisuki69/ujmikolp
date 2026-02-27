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
import p3.C2011b;

/* JADX INFO: loaded from: classes4.dex */
public class EventsRecorderWorker extends SplitWorker {
    public EventsRecorderWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        try {
            this.f17614d = new C1684a(new c(this.f17613b, b.a(this.c, "/events/bulk", null), new C2011b(26)), StorageFactory.getPersistentEventsStorageForWorker(this.f17612a, workerParameters.getInputData().getString("apiKey"), workerParameters.getInputData().getBoolean("encryptionEnabled", false)), new S(workerParameters.getInputData().getInt("eventsPerPush", 100)), StorageFactory.getTelemetryStorage(workerParameters.getInputData().getBoolean("shouldRecordTelemetry", false)));
        } catch (URISyntaxException e) {
            a.g("Error creating Split worker: " + e.getMessage());
        }
    }
}
