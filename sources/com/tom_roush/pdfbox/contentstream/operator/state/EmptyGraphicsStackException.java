package com.tom_roush.pdfbox.contentstream.operator.state;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class EmptyGraphicsStackException extends IOException {
    public EmptyGraphicsStackException() {
        super("Cannot execute restore, the graphics stack is empty");
    }
}
