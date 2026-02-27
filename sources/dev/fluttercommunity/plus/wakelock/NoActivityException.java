package dev.fluttercommunity.plus.wakelock;

/* JADX INFO: loaded from: classes4.dex */
public final class NoActivityException extends Exception {
    public NoActivityException() {
        super("wakelock requires a foreground activity");
    }
}
