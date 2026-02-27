package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFc1eSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class ParsingException extends IOException {

    @NonNull
    private final AFc1eSDK<String> valueOf;

    public ParsingException(String str, Throwable th2, @NonNull AFc1eSDK<String> aFc1eSDK) {
        super(str, th2);
        this.valueOf = aFc1eSDK;
    }

    @NonNull
    public AFc1eSDK<String> getRawResponse() {
        return this.valueOf;
    }
}
