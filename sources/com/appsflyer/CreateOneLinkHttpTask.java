package com.appsflyer;

import androidx.annotation.WorkerThread;
import com.appsflyer.internal.AFc1lSDK;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class CreateOneLinkHttpTask {
    public final AFc1lSDK valueOf;
    public final ExecutorService values;

    @Deprecated
    public interface ResponseListener {
        @WorkerThread
        void onResponse(String str);

        @WorkerThread
        void onResponseError(String str);
    }

    public CreateOneLinkHttpTask() {
    }

    public CreateOneLinkHttpTask(AFc1lSDK aFc1lSDK, ExecutorService executorService) {
        this.valueOf = aFc1lSDK;
        this.values = executorService;
    }
}
