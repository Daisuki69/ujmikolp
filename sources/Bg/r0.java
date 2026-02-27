package bg;

import android.util.Base64;
import cj.C1110A;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.TypeCastException;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.gson.j f9114a = new com.google.gson.k().a();

    public r0(C0952A c0952a) {
    }

    public final String a(ArrayList arrayList) throws IOException {
        String strA;
        Signature signature;
        PrivateKey privateKeyGeneratePrivate;
        Type type = new TypeToken<Map<String, ?>>() { // from class: credoapp.private.v8$a
        }.getType();
        StringBuilder sb2 = new StringBuilder();
        while (!arrayList.isEmpty()) {
            sb2.append(this.f9114a.l(C1110A.A(arrayList), type));
            if (arrayList.size() > 1) {
                sb2.append(",");
            }
            arrayList.remove(0);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.j.c(string, "this.toString()");
        Charset charsetForName = Charset.forName("UTF8");
        kotlin.jvm.internal.j.f(charsetForName, "Charset.forName(charsetName)");
        byte[] bytes = string.getBytes(charsetForName);
        kotlin.jvm.internal.j.f(bytes, "(this as java.lang.String).getBytes(charset)");
        try {
            signature = Signature.getInstance("SHA256withRSA");
            privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode("MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDCZ6SbU0TE0MKM\nNuETIXjmfpWyv5cYBkX5cncFyenFuKYbKufUUBaTPwojej1p2i9c8NA1AffsJ/WE\nq6KZSun80AtQVuRSIib71HXsFf3N149tb0cKCcaxqkZkalTKQFLk9VmWNjLj1H2q\nGI7rfB8E/hSr/agxNfJ52WmV8ok+71+C0uJdMNwx+JO+O+Ojcm3vkPu1TQSxxLde\no8Y9OWqo7p/UBRVoWmqrI5s3BWOIBUFH18WsNwrDu2RxGrhDHFMiZd+lbuNHC+OL\nmrYODfik3I5tVL8FmvzlRraLn4KoR9KdWw5QRyr3VuX4uBzHcTpg/yFjMya+i5d+\nIUnQOAPJAgMBAAECggEALckRKI/c82mjWDiYm9PXUJnhkd6zrDHWCyDdTVy3lRye\n6mkZfpR6LKW9MovYqPR9ESuaLdHP3SuwFFYEDoxpPWSWNY6xaXKnscnhGAA57V/m\nZMS/e2rABBnxSDcOzy+FFm1+cvVC2QuzqPrttiJef+ODZNpx4V0uRWpiBrG/hzWZ\n4tL77O1DovHsnXfcDMdOo5iIr638dULXUzfd/Nx2cxGC/wybGFgS6XG/kUiJMaeI\nT0aASZbTIgzMa22HaAKSL5iIFpNr+ijOY5aAAXQ0oScNzpnhHOCOWoxgQKJhssxx\n4eVp4c6k/NR8QfFago3zj1R4kiRDESht8KDsgjg2bQKBgQDxqhtT/QDZtvA4BCfX\nULwplmesZM54QPWKFwAtSJCwIuyjg9Nt3TEVGCFbX5BpHGjH52/jtaJVjUDQf0jK\n7G19tcRCV8AjI9Fj5Kqb1HnClLsliPLyn4AqYhOPfbvq8wtIZVyFz21cUM2kiQgM\n9DF5A7Yy7FLl98FUGNXLxtYdCwKBgQDN79svtMV4c3oTuM9XdlUEqS81q19qPKRx\nQ3kNQk5IH4rEQsyg8X4IebRlX99Z0WsunIxx2+0Dv4LHsCy8iNrhy2PWifJPug/y\ngFyHn/V33nps/pe05qY4nLrLJx82bhCgVp+EfGWpPfBiSRDuaBTQJ3a+KB0E/qi1\ndFciGY7e+wKBgAqPlIInHFJnXDgWdmdCb/ahTAaMoTlAHXrbZnaUJT6NSCodKLA0\namCxnUOQ+Y6eXzXdN1aMKXvzoFF8PoIfsuk7eEgt7YebmRr0c0A8GNYYCdWqFnPj\n5IX1o0UyCXRLCsMvKsvuNKlEHriCBIgMY90V/HBdQ4IpQZmbPDybg9/hAoGBAI0i\nHoMZTmP4L+eoNmDodeeV0wbjBacXHFOLPEC7+k4vX7iVVwvNtOQ2FE2NYNJ7VQtC\nunWllU+GRih4MpCa8fbgnvF+5JODHj7BfahtFZsq25gq+uk9URlnQBTOIPP6hmZ8\nNyJi5oEQM9gH3xSkO+9TvGshrpGnvRNuQfDatzFVAoGAeMYmWmQZ3NJEPoiBRJvl\n39Urc8dq0NT8L6sgCddq9fDczl1lN5HV91GGKmc1wJvpgiHZR3jK9Fqn4JZKuTGJ\nah2nZ2XjpI4P/wyROzZ/2bphK7snu2Pl8cBVDLkTqRe3ZZJQU+roOThzSufaC43d\nwI80JQrJRdyJAzXF3LYTlHg=", 0)));
        } catch (Exception unused) {
            strA = C0952A.a(new byte[0]);
        }
        if (privateKeyGeneratePrivate == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.security.interfaces.RSAPrivateKey");
        }
        signature.initSign((RSAPrivateKey) privateKeyGeneratePrivate);
        signature.update(bytes);
        byte[] bArrSign = signature.sign();
        kotlin.jvm.internal.j.c(bArrSign, "rsaSignatureProvider.sign()");
        strA = C0952A.a(bArrSign);
        sb2.append(String.format(",{\"Footer\":[\"%s\"]}", Arrays.copyOf(new Object[]{strA}, 1)));
        sb2.insert(0, "[");
        sb2.append("]");
        String string2 = sb2.toString();
        kotlin.jvm.internal.j.c(string2, "StringBuilder().apply {\n…\"]\")\n        }.toString()");
        return string2;
    }
}
