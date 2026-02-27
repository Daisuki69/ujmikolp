package nj;

import java.io.File;
import kotlin.io.AccessDeniedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18739b;
    public File[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18740d;
    public final /* synthetic */ f e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, File rootDir) {
        super(rootDir);
        kotlin.jvm.internal.j.g(rootDir, "rootDir");
        this.e = fVar;
    }

    @Override // nj.g
    public final File a() {
        Function2 function2;
        boolean z4 = this.f18739b;
        f fVar = this.e;
        File file = this.f18742a;
        if (z4) {
            File[] fileArr = this.c;
            if (fileArr == null || this.f18740d < fileArr.length) {
                if (fileArr == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.c = fileArrListFiles;
                    if (fileArrListFiles == null && (function2 = fVar.f18741d.e) != null) {
                        function2.invoke(file, new AccessDeniedException(this.f18742a, null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        Function1 function1 = fVar.f18741d.f18745d;
                        if (function1 != null) {
                            function1.invoke(file);
                        }
                    }
                }
                File[] fileArr3 = this.c;
                kotlin.jvm.internal.j.d(fileArr3);
                int i = this.f18740d;
                this.f18740d = i + 1;
                return fileArr3[i];
            }
            Function1 function12 = fVar.f18741d.f18745d;
            if (function12 != null) {
                function12.invoke(file);
                return null;
            }
        } else {
            Function1 function13 = fVar.f18741d.c;
            if (function13 == null || ((Boolean) function13.invoke(file)).booleanValue()) {
                this.f18739b = true;
                return file;
            }
        }
        return null;
    }
}
