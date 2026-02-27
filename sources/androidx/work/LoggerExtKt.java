package androidx.work;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class LoggerExtKt {
    public static final void logd(String tag, Function0<String> block) {
        j.g(tag, "tag");
        j.g(block, "block");
        Logger.get().debug(tag, (String) block.invoke());
    }

    public static final void loge(String tag, Function0<String> block) {
        j.g(tag, "tag");
        j.g(block, "block");
        Logger.get().error(tag, (String) block.invoke());
    }

    public static final void logi(String tag, Function0<String> block) {
        j.g(tag, "tag");
        j.g(block, "block");
        Logger.get().info(tag, (String) block.invoke());
    }

    public static final void logd(String tag, Throwable t5, Function0<String> block) {
        j.g(tag, "tag");
        j.g(t5, "t");
        j.g(block, "block");
        Logger.get().debug(tag, (String) block.invoke(), t5);
    }

    public static final void loge(String tag, Throwable t5, Function0<String> block) {
        j.g(tag, "tag");
        j.g(t5, "t");
        j.g(block, "block");
        Logger.get().error(tag, (String) block.invoke(), t5);
    }

    public static final void logi(String tag, Throwable t5, Function0<String> block) {
        j.g(tag, "tag");
        j.g(t5, "t");
        j.g(block, "block");
        Logger.get().info(tag, (String) block.invoke(), t5);
    }
}
