package mx_android.support.v4.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import mx_android.support.v4.content.Loader;

/* JADX INFO: loaded from: classes7.dex */
public class CursorLoader extends AsyncTaskLoader<Cursor> {
    Cursor mCursor;
    final Loader<Cursor>.ForceLoadContentObserver mObserver;
    String[] mProjection;
    String mSelection;
    String[] mSelectionArgs;
    String mSortOrder;
    Uri mUri;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // mx_android.support.v4.content.AsyncTaskLoader
    public Cursor loadInBackground() {
        Cursor cursorQuery = getContext().getContentResolver().query(this.mUri, this.mProjection, this.mSelection, this.mSelectionArgs, this.mSortOrder);
        if (cursorQuery != null) {
            cursorQuery.getCount();
            cursorQuery.registerContentObserver(this.mObserver);
        }
        return cursorQuery;
    }

    @Override // mx_android.support.v4.content.Loader
    public void deliverResult(Cursor cursor) {
        if (isReset()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.mCursor;
        this.mCursor = cursor;
        if (isStarted()) {
            super.deliverResult(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    public CursorLoader(Context context) {
        super(context);
        this.mObserver = new Loader.ForceLoadContentObserver();
    }

    public CursorLoader(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.mObserver = new Loader.ForceLoadContentObserver();
        this.mUri = uri;
        this.mProjection = strArr;
        this.mSelection = str;
        this.mSelectionArgs = strArr2;
        this.mSortOrder = str2;
    }

    @Override // mx_android.support.v4.content.Loader
    protected void onStartLoading() {
        Cursor cursor = this.mCursor;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.mCursor == null) {
            forceLoad();
        }
    }

    @Override // mx_android.support.v4.content.Loader
    protected void onStopLoading() {
        cancelLoad();
    }

    @Override // mx_android.support.v4.content.AsyncTaskLoader
    public void onCanceled(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // mx_android.support.v4.content.Loader
    protected void onReset() {
        super.onReset();
        onStopLoading();
        Cursor cursor = this.mCursor;
        if (cursor != null && !cursor.isClosed()) {
            this.mCursor.close();
        }
        this.mCursor = null;
    }

    public Uri getUri() {
        return this.mUri;
    }

    public void setUri(Uri uri) {
        this.mUri = uri;
    }

    public String[] getProjection() {
        return this.mProjection;
    }

    public void setProjection(String[] strArr) {
        this.mProjection = strArr;
    }

    public String getSelection() {
        return this.mSelection;
    }

    public void setSelection(String str) {
        this.mSelection = str;
    }

    public String[] getSelectionArgs() {
        return this.mSelectionArgs;
    }

    public void setSelectionArgs(String[] strArr) {
        this.mSelectionArgs = strArr;
    }

    public String getSortOrder() {
        return this.mSortOrder;
    }

    public void setSortOrder(String str) {
        this.mSortOrder = str;
    }

    @Override // mx_android.support.v4.content.AsyncTaskLoader, mx_android.support.v4.content.Loader
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.mUri);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.mProjection));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.mSelection);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.mSelectionArgs));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.mSortOrder);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.mCursor);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.mContentChanged);
    }
}
