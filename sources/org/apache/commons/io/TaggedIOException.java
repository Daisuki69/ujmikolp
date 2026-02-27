package org.apache.commons.io;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class TaggedIOException extends IOExceptionWithCause {
    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return (IOException) super.getCause();
    }
}
