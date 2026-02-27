package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFc1kSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class HttpException extends IOException {
    private final AFc1kSDK values;

    public HttpException(@NonNull Throwable th2, @NonNull AFc1kSDK aFc1kSDK) {
        super(th2.getMessage(), th2);
        this.values = aFc1kSDK;
    }

    @NonNull
    public AFc1kSDK getMetrics() {
        return this.values;
    }
}
