package androidx.webkit;

import androidx.webkit.WebNavigationClient;

/* JADX INFO: loaded from: classes2.dex */
@WebNavigationClient.ExperimentalNavigationCallback
public interface Navigation {
    boolean didCommit();

    boolean didCommitErrorPage();

    Page getPage();

    int getStatusCode();

    boolean isBack();

    boolean isForward();

    boolean isHistory();

    boolean isReload();

    boolean isRestore();

    boolean isSameDocument();

    boolean wasInitiatedByPage();
}
