package com.github.barteksc.pdfviewer.exception;

/* JADX INFO: loaded from: classes2.dex */
public class PageRenderingException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9596a;

    public PageRenderingException(int i, Exception exc) {
        super(exc);
        this.f9596a = i;
    }
}
