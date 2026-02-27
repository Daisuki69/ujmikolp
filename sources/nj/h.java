package nj;

import java.io.File;
import java.util.Iterator;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Sequence<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f18743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileWalkDirection f18744b;
    public final Function1 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f18745d;
    public final Function2 e;
    public final int f;

    public h(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i) {
        this.f18743a = file;
        this.f18744b = fileWalkDirection;
        this.c = function1;
        this.f18745d = function12;
        this.e = function2;
        this.f = i;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new f(this);
    }

    public /* synthetic */ h(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i4 & 2) != 0 ? FileWalkDirection.f18171a : fileWalkDirection, function1, function12, function2, (i4 & 32) != 0 ? Integer.MAX_VALUE : i);
    }
}
