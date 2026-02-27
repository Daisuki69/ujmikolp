package com.google.android.gms.appset;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public interface AppSetIdClient {
    @NonNull
    Task<AppSetIdInfo> getAppSetIdInfo();
}
