package io.reactivex.rxjava3.exceptions;

import Bh.a;
import Bh.b;
import a.AbstractC0617a;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CompositeException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17566b;
    public Throwable c;

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public static void a(StringBuilder sb2, Throwable th2, String str) {
        sb2.append(str);
        sb2.append(th2);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            sb2.append("\t\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        if (th2.getCause() != null) {
            sb2.append("\tCaused by: ");
            a(sb2, th2.getCause(), "");
        }
    }

    public final void b(AbstractC0617a abstractC0617a) {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(this);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        int i = 1;
        for (Throwable th2 : this.f17565a) {
            sb2.append("  ComposedException ");
            sb2.append(i);
            sb2.append(" :\n");
            a(sb2, th2, "\t");
            i++;
        }
        abstractC0617a.K(sb2.toString());
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        int i;
        try {
            if (this.c == null) {
                String property = System.getProperty("line.separator");
                if (this.f17565a.size() > 1) {
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Multiple exceptions (");
                    sb2.append(this.f17565a.size());
                    sb2.append(")");
                    sb2.append(property);
                    for (Throwable cause : this.f17565a) {
                        int i4 = 0;
                        while (true) {
                            if (cause != null) {
                                for (int i6 = 0; i6 < i4; i6++) {
                                    sb2.append("  ");
                                }
                                sb2.append("|-- ");
                                sb2.append(cause.getClass().getCanonicalName());
                                sb2.append(": ");
                                String message = cause.getMessage();
                                if (message == null || !message.contains(property)) {
                                    sb2.append(message);
                                    sb2.append(property);
                                } else {
                                    sb2.append(property);
                                    for (String str : message.split(property)) {
                                        for (int i10 = 0; i10 < i4 + 2; i10++) {
                                            sb2.append("  ");
                                        }
                                        sb2.append(str);
                                        sb2.append(property);
                                    }
                                }
                                int i11 = 0;
                                while (true) {
                                    i = i4 + 2;
                                    if (i11 >= i) {
                                        break;
                                    }
                                    sb2.append("  ");
                                    i11++;
                                }
                                StackTraceElement[] stackTrace = cause.getStackTrace();
                                if (stackTrace.length > 0) {
                                    sb2.append("at ");
                                    sb2.append(stackTrace[0]);
                                    sb2.append(property);
                                }
                                if (identityHashMap.containsKey(cause)) {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 != null) {
                                        for (int i12 = 0; i12 < i; i12++) {
                                            sb2.append("  ");
                                        }
                                        sb2.append("|-- ");
                                        sb2.append("(cause not expanded again) ");
                                        sb2.append(cause2.getClass().getCanonicalName());
                                        sb2.append(": ");
                                        sb2.append(cause2.getMessage());
                                        sb2.append(property);
                                    }
                                } else {
                                    identityHashMap.put(cause, Boolean.TRUE);
                                    cause = cause.getCause();
                                    i4++;
                                }
                            }
                        }
                    }
                    this.c = new a(sb2.toString().trim(), 0);
                } else {
                    this.c = (Throwable) this.f17565a.get(0);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f17566b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new b(printStream, 0));
    }

    public CompositeException(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th2 = (Throwable) it.next();
                if (th2 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th2).f17565a);
                } else if (th2 != null) {
                    linkedHashSet.add(th2);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
            this.f17565a = listUnmodifiableList;
            this.f17566b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new b(printWriter, 1));
    }
}
