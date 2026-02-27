package io.split.android.client.storage.splits;

import io.split.android.client.dtos.Split;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public interface c extends Fi.a {
    void b(String str);

    void e(Split split);

    String f();

    void g(String str);

    Split get(String str);

    HashMap getAll();

    long getTill();

    boolean h(b bVar, ExecutorService executorService);

    String i();

    boolean k(String str);
}
