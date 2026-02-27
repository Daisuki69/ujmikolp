package We;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import dOYHB6.tiZVw8.numX49;
import java.io.FileNotFoundException;
import java.io.InputStream;
import okio.Okio;

/* JADX INFO: renamed from: We.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0605i extends H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UriMatcher f6403b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6404a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f6403b = uriMatcher;
        String strTnTj78 = numX49.tnTj78("bkR7");
        uriMatcher.addURI(strTnTj78, numX49.tnTj78("bkRA"), 1);
        uriMatcher.addURI(strTnTj78, numX49.tnTj78("bkRY"), 1);
        uriMatcher.addURI(strTnTj78, numX49.tnTj78("bkRT"), 2);
        uriMatcher.addURI(strTnTj78, numX49.tnTj78("bkRR"), 3);
        uriMatcher.addURI(strTnTj78, numX49.tnTj78("bkRp"), 4);
    }

    public C0605i(Context context) {
        this.f6404a = context;
    }

    @Override // We.H
    public final boolean b(F f) {
        Uri uri = f.f6354a;
        return numX49.tnTj78("bkR0").equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f6403b.match(uri) != -1;
    }

    @Override // We.H
    public final Q3.b e(F f, int i) throws FileNotFoundException {
        InputStream inputStreamOpenContactPhotoInputStream;
        ContentResolver contentResolver = this.f6404a.getContentResolver();
        Uri uriLookupContact = f.f6354a;
        int iMatch = f6403b.match(uriLookupContact);
        if (iMatch != 1) {
            if (iMatch != 2) {
                if (iMatch != 3) {
                    if (iMatch != 4) {
                        throw new IllegalStateException(numX49.tnTj78("bkRg") + uriLookupContact);
                    }
                }
            }
            inputStreamOpenContactPhotoInputStream = contentResolver.openInputStream(uriLookupContact);
        } else {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uriLookupContact);
            inputStreamOpenContactPhotoInputStream = uriLookupContact == null ? null : ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
        }
        if (inputStreamOpenContactPhotoInputStream == null) {
            return null;
        }
        return new Q3.b(Okio.source(inputStreamOpenContactPhotoInputStream), 2);
    }
}
