package io.split.android.client.service.sseclient.notifications.mysegments;

import androidx.annotation.NonNull;
import java.math.BigInteger;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import si.C2261c;
import si.e;

/* JADX INFO: loaded from: classes4.dex */
public class MySegmentsNotificationProcessorConfiguration {
    private final BigInteger mHashedUserKey;
    private final e mMySegmentsTaskFactory;
    private final BlockingQueue<C2261c> mNotificationsQueue;
    private final String mUserKey;

    public MySegmentsNotificationProcessorConfiguration(@NonNull e eVar, @NonNull LinkedBlockingDeque<C2261c> linkedBlockingDeque, @NonNull String str, @NonNull BigInteger bigInteger) {
        Objects.requireNonNull(eVar);
        this.mMySegmentsTaskFactory = eVar;
        Objects.requireNonNull(linkedBlockingDeque);
        this.mNotificationsQueue = linkedBlockingDeque;
        Objects.requireNonNull(str);
        this.mUserKey = str;
        Objects.requireNonNull(bigInteger);
        this.mHashedUserKey = bigInteger;
    }

    public BigInteger getHashedUserKey() {
        return this.mHashedUserKey;
    }

    public e getMySegmentsTaskFactory() {
        return this.mMySegmentsTaskFactory;
    }

    public BlockingQueue<C2261c> getNotificationsQueue() {
        return this.mNotificationsQueue;
    }

    public String getUserKey() {
        return this.mUserKey;
    }
}
