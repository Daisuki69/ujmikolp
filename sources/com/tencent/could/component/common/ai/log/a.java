package com.tencent.could.component.common.ai.log;

import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f15549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f15550b;

    public a(b bVar, String str) {
        this.f15550b = bVar;
        this.f15549a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        b bVar = this.f15550b;
        if (bVar.f15553d == null) {
            return;
        }
        if (bVar.f15551a.isUseExternalFile() && !com.tencent.could.component.common.ai.utils.a.a(this.f15550b.f15553d.get())) {
            Log.e("FilePrinter", "Do not have permission to check local file!");
            return;
        }
        String str = this.f15549a;
        if (TextUtils.isEmpty(str)) {
            Log.e("FilePrinter", "logFolderPath is empty!");
            return;
        }
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (!file.isDirectory()) {
                try {
                    b bVar2 = this.f15550b;
                    if (bVar2 == null) {
                        throw null;
                    }
                    if (file.lastModified() < System.currentTimeMillis() - bVar2.f15551a.getFileOutTime() && !file.delete()) {
                        Log.e("FilePrinter", "delete file error : path " + file.getCanonicalPath());
                    }
                } catch (IOException e) {
                    Log.e("FilePrinter", "readAnCheckLocalFile error : " + e.getMessage());
                }
            }
        }
    }
}
