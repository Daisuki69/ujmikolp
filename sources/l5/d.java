package L5;

import net.zetetic.database.sqlcipher.SQLiteDatabase;
import net.zetetic.database.sqlcipher.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends SQLiteOpenHelper {
    @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
    public final void i(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.r("CREATE TABLE user (_id INTEGER PRIMARY KEY AUTOINCREMENT, user_id TEXT NOT NULL, first_name TEXT, middle_name TEXT, last_name TEXT, birth_date TEXT, UNIQUE (user_id) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r(" CREATE TABLE address (_id INTEGER PRIMARY KEY AUTOINCREMENT, address_id TEXT NOT NULL, line1 TEXT, line2 TEXT, locality TEXT, city TEXT, state TEXT, zip_code TEXT, country_code TEXT, UNIQUE (address_id) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r("CREATE TABLE identity (_id INTEGER PRIMARY KEY AUTOINCREMENT, value TEXT NOT NULL, type TEXT, verified INTEGER, UNIQUE (value) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r("CREATE TABLE fund_source (_id INTEGER PRIMARY KEY AUTOINCREMENT, value TEXT NOT NULL, name TEXT NOT NULL,type TEXT NOT NULL, status TEXT, transaction_enabled INTEGER, scheme TEXT NOT NULL, brand TEXT NOT NULL, UNIQUE (value) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r(" CREATE TABLE account_balance (_id INTEGER PRIMARY KEY AUTOINCREMENT, balance_id TEXT NOT NULL, available_currency TEXT, available_value TEXT, current_currency TEXT, current_value TEXT, UNIQUE (balance_id) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r("CREATE TABLE user_activity (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, type TEXT, method TEXT, status TEXT, timestamp TEXT, display TEXT, description_action TEXT, description_target TEXT, description_value TEXT, description_currency TEXT, fee_currency TEXT, fee_value TEXT, fee_label TEXT, fee_display TEXT, status_display TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r("CREATE TABLE backup_identity (_id INTEGER PRIMARY KEY AUTOINCREMENT, value TEXT NOT NULL, type TEXT, is_verified INTEGER, UNIQUE (value) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r(" CREATE TABLE block_reason (_id INTEGER PRIMARY KEY AUTOINCREMENT, reason_id TEXT NOT NULL, type TEXT NOT NULL, reason_code TEXT NOT NULL, description TEXT NOT NULL, UNIQUE (reason_id) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r("CREATE TABLE product_v2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT, product_type TEXT, shop_categories TEXT, image_url TEXT, icon_url TEXT, description TEXT, product_code TEXT, original_currency TEXT, original_value TEXT, discounted_currency TEXT, discounted_value TEXT, promo INTEGER, category TEXT, network TEXT, priority INTEGER, page INTEGER, disabled INTEGER, UNIQUE (id) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r("CREATE TABLE shop_category (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT, code TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r("CREATE TABLE product_type (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, category_id TEXT, name TEXT, code TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r("CREATE TABLE shop_transaction_v2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, userNumber TEXT NOT NULL, id TEXT NOT NULL, product_type TEXT NOT NULL, purchase_date INTEGER NOT NULL, UNIQUE (userNumber , id) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r(" CREATE TABLE biller (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, slug TEXT, category TEXT, categorySlug TEXT, listUrl TEXT, iconUrl TEXT, confirmationUrl TEXT, accountNumberPlaceholder TEXT, amountPlaceholder TEXT, UNIQUE (slug) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r(" CREATE TABLE biller_transaction (_id INTEGER PRIMARY KEY AUTOINCREMENT, slug TEXT NOT NULL, userNumber TEXT NOT NULL, accountNumber TEXT NOT NULL, amountCurrency TEXT NOT NULL, amountValue TEXT NOT NULL, UNIQUE (slug , userNumber) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r("CREATE TABLE load_up_partner (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT, subtitle TEXT, type TEXT, limit_min_currency TEXT, limit_min_value TEXT, limit_max_currency TEXT, limit_max_value TEXT, maintenance_start TEXT, maintenance_end TEXT, maintenance_message TEXT, icon_url_xhdpi TEXT, icon_url_hdpi TEXT, icon_url_mdpi TEXT, steps TEXT, channel TEXT, slug TEXT, no_fee_display INTEGER, UNIQUE (id) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r("CREATE TABLE bank (_id INTEGER PRIMARY KEY AUTOINCREMENT, bank_code TEXT NOT NULL, bank_name TEXT NOT NULL, is_active INTEGER, is_maintenance INTEGER, fee TEXT, bank_ic TEXT, UNIQUE (bank_code) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r("CREATE TABLE form_series_bir (_id INTEGER PRIMARY KEY AUTOINCREMENT, form_type TEXT NOT NULL, form_series TEXT NOT NULL, tax_type TEXT, UNIQUE (form_type) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r("CREATE TABLE voucher (_id INTEGER PRIMARY KEY AUTOINCREMENT, assignment_id INTEGER, account_name TEXT, campaign_name TEXT, code TEXT NOT NULL, sender TEXT, recipient TEXT, status TEXT, start_date TEXT, end_date TEXT, icon_url TEXT, banner_url TEXT, faq TEXT, mechanics TEXT, external_partner_code TEXT, denomination_type TEXT, denomination_value DECIMAL, page INTEGER, notification_dates_expiry TEXT, notification_type TEXT, notification_spiel TEXT, has_reminder INTEGER, redeemed_date TEXT, UNIQUE (assignment_id)ON CONFLICT REPLACE )", null);
        sQLiteDatabase.r("CREATE TABLE voucher_reminder (_id INTEGER PRIMARY KEY AUTOINCREMENT, id INTEGER NOT NULL, has_reminder INTEGER, UNIQUE (id) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r(" CREATE TABLE biller_category (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, slug TEXT, listUrl TEXT, UNIQUE (slug) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r(" CREATE TABLE biller_v2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, slug TEXT, category TEXT, categorySlug TEXT, active INTEGER, listUrl TEXT, iconUrl TEXT, confirmationUrl TEXT, hasOtherCharges INTEGER, paymentMethods TEXT, UNIQUE (slug) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r(" CREATE TABLE online_payment (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT NOT NULL, code TEXT, category TEXT, link TEXT, maintenance TEXT, background_url TEXT, icon_url TEXT, logo_url TEXT, priority INTEGER, tags TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r("CREATE TABLE shop_purchase_history (_id INTEGER PRIMARY KEY AUTOINCREMENT, product_id TEXT, product_name TEXT, product_description TEXT, image_url TEXT, icon_url TEXT, recipient TEXT, status TEXT, created_at TEXT, updated_at TEXT, payment_trn TEXT, order_reference_number TEXT, price DECIMAL, page INTEGER, code TEXT, network TEXT, other_fields TEXT, gifted INTEGER, with_receipt INTEGER, available_receipt INTEGER, UNIQUE (order_reference_number) ON CONFLICT REPLACE )", null);
        sQLiteDatabase.r(" CREATE TABLE decoration (_id INTEGER PRIMARY KEY AUTOINCREMENT, created_at TEXT, updated_at TEXT, id TEXT NOT NULL, category TEXT, label TEXT, description TEXT, iconUrl TEXT, imageUrl TEXT, priority INTEGER, hidden INTEGER, UNIQUE (id) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r("CREATE TABLE product_v3 (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT, product_type TEXT, provider TEXT, shop_categories TEXT, logo_url TEXT, icon_url TEXT, description TEXT, product_code TEXT, original_currency TEXT, original_value DECIMAL, discounted_currency TEXT, discounted_value DECIMAL, promo INTEGER, category TEXT, network TEXT, priority INTEGER, page INTEGER, disabled INTEGER, provider_details TEXT, provider_display_name TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r("CREATE TABLE shop_provider (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT NOT NULL, display_name TEXT NOT NULL, description TEXT NOT NULL, network TEXT, priority INTEGER, categories TEXT, created_at TEXT NOT NULL, updated_at TEXT NOT NULL, logo_url TEXT, icon_url TEXT, background_url TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r("CREATE TABLE credit_transaction (_id INTEGER PRIMARY KEY AUTOINCREMENT, accountId TEXT , transactionId TEXT NOT NULL, transactionReference TEXT, totalAmount TEXT, currency TEXT, transactionType TEXT, action TEXT, target TEXT, dateTime TEXT, UNIQUE (transactionId) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r(" CREATE TABLE shop_provider_subcategory (_id INTEGER PRIMARY KEY AUTOINCREMENT, provider_name TEXT NOT NULL, id TEXT NOT NULL, name TEXT NOT NULL, code TEXT NOT NULL, priority INTEGER, UNIQUE (provider_name , id) ON CONFLICT REPLACE)", null);
        sQLiteDatabase.r(" CREATE TABLE action_card_recommendation (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT, title TEXT, subtitle TEXT, color TEXT, application_uri TEXT, media TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
    public final void q(SQLiteDatabase sQLiteDatabase, int i, int i4) {
        String str;
        String str2;
        if (i < 24) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS bank", null);
            sQLiteDatabase.r("DROP TABLE IF EXISTS load_up_partner", null);
            sQLiteDatabase.r("CREATE TABLE bank (_id INTEGER PRIMARY KEY AUTOINCREMENT, bank_code TEXT NOT NULL, bank_name TEXT NOT NULL, is_active INTEGER, is_maintenance INTEGER, fee TEXT, bank_ic TEXT, UNIQUE (bank_code) ON CONFLICT REPLACE)", null);
            sQLiteDatabase.r("CREATE TABLE load_up_partner (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT, subtitle TEXT, type TEXT, limit_min_currency TEXT, limit_min_value TEXT, limit_max_currency TEXT, limit_max_value TEXT, maintenance_start TEXT, maintenance_end TEXT, maintenance_message TEXT, icon_url_xhdpi TEXT, icon_url_hdpi TEXT, icon_url_mdpi TEXT, steps TEXT, channel TEXT, slug TEXT, no_fee_display INTEGER, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 25) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS product_v2", null);
            sQLiteDatabase.r("DROP TABLE IF EXISTS shop_transaction_v2", null);
            sQLiteDatabase.r("CREATE TABLE product_v2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT, product_type TEXT, shop_categories TEXT, image_url TEXT, icon_url TEXT, description TEXT, product_code TEXT, original_currency TEXT, original_value TEXT, discounted_currency TEXT, discounted_value TEXT, promo INTEGER, category TEXT, network TEXT, priority INTEGER, page INTEGER, disabled INTEGER, UNIQUE (id) ON CONFLICT REPLACE)", null);
            sQLiteDatabase.r("CREATE TABLE shop_transaction_v2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, userNumber TEXT NOT NULL, id TEXT NOT NULL, product_type TEXT NOT NULL, purchase_date INTEGER NOT NULL, UNIQUE (userNumber , id) ON CONFLICT REPLACE)", null);
        }
        if (i < 26) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS bank", null);
            sQLiteDatabase.r("CREATE TABLE bank (_id INTEGER PRIMARY KEY AUTOINCREMENT, bank_code TEXT NOT NULL, bank_name TEXT NOT NULL, is_active INTEGER, is_maintenance INTEGER, fee TEXT, bank_ic TEXT, UNIQUE (bank_code) ON CONFLICT REPLACE)", null);
        }
        if (i < 28) {
            sQLiteDatabase.r("CREATE TABLE form_series_bir (_id INTEGER PRIMARY KEY AUTOINCREMENT, form_type TEXT NOT NULL, form_series TEXT NOT NULL, tax_type TEXT, UNIQUE (form_type) ON CONFLICT REPLACE)", null);
            sQLiteDatabase.r("CREATE TABLE voucher (_id INTEGER PRIMARY KEY AUTOINCREMENT, assignment_id INTEGER, account_name TEXT, campaign_name TEXT, code TEXT NOT NULL, sender TEXT, recipient TEXT, status TEXT, start_date TEXT, end_date TEXT, icon_url TEXT, banner_url TEXT, faq TEXT, mechanics TEXT, external_partner_code TEXT, denomination_type TEXT, denomination_value DECIMAL, page INTEGER, notification_dates_expiry TEXT, notification_type TEXT, notification_spiel TEXT, has_reminder INTEGER, redeemed_date TEXT, UNIQUE (assignment_id)ON CONFLICT REPLACE )", null);
        }
        if (i < 29) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS voucher", null);
            sQLiteDatabase.r("CREATE TABLE voucher (_id INTEGER PRIMARY KEY AUTOINCREMENT, assignment_id INTEGER, account_name TEXT, campaign_name TEXT, code TEXT NOT NULL, sender TEXT, recipient TEXT, status TEXT, start_date TEXT, end_date TEXT, icon_url TEXT, banner_url TEXT, faq TEXT, mechanics TEXT, external_partner_code TEXT, denomination_type TEXT, denomination_value DECIMAL, page INTEGER, notification_dates_expiry TEXT, notification_type TEXT, notification_spiel TEXT, has_reminder INTEGER, redeemed_date TEXT, UNIQUE (assignment_id)ON CONFLICT REPLACE )", null);
        }
        if (i < 30) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS backup_identity", null);
            sQLiteDatabase.r("CREATE TABLE backup_identity (_id INTEGER PRIMARY KEY AUTOINCREMENT, value TEXT NOT NULL, type TEXT, is_verified INTEGER, UNIQUE (value) ON CONFLICT REPLACE)", null);
        }
        if (i < 31) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS product", null);
            sQLiteDatabase.r("DROP TABLE IF EXISTS shop_transaction", null);
        }
        if (i < 32) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS voucher", null);
            sQLiteDatabase.r("CREATE TABLE voucher (_id INTEGER PRIMARY KEY AUTOINCREMENT, assignment_id INTEGER, account_name TEXT, campaign_name TEXT, code TEXT NOT NULL, sender TEXT, recipient TEXT, status TEXT, start_date TEXT, end_date TEXT, icon_url TEXT, banner_url TEXT, faq TEXT, mechanics TEXT, external_partner_code TEXT, denomination_type TEXT, denomination_value DECIMAL, page INTEGER, notification_dates_expiry TEXT, notification_type TEXT, notification_spiel TEXT, has_reminder INTEGER, redeemed_date TEXT, UNIQUE (assignment_id)ON CONFLICT REPLACE )", null);
        }
        if (i < 33) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS biller_category", null);
            sQLiteDatabase.r(" CREATE TABLE biller_category (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, slug TEXT, listUrl TEXT, UNIQUE (slug) ON CONFLICT REPLACE)", null);
        }
        if (i < 34) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS biller_v2", null);
            sQLiteDatabase.r(" CREATE TABLE biller_v2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, slug TEXT, category TEXT, categorySlug TEXT, active INTEGER, listUrl TEXT, iconUrl TEXT, confirmationUrl TEXT, hasOtherCharges INTEGER, paymentMethods TEXT, UNIQUE (slug) ON CONFLICT REPLACE)", null);
        }
        if (i < 35) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS product_v2", null);
            sQLiteDatabase.r("CREATE TABLE product_v2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT, product_type TEXT, shop_categories TEXT, image_url TEXT, icon_url TEXT, description TEXT, product_code TEXT, original_currency TEXT, original_value TEXT, discounted_currency TEXT, discounted_value TEXT, promo INTEGER, category TEXT, network TEXT, priority INTEGER, page INTEGER, disabled INTEGER, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 36) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS user_activity", null);
            sQLiteDatabase.r("CREATE TABLE user_activity (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, type TEXT, method TEXT, status TEXT, timestamp TEXT, display TEXT, description_action TEXT, description_target TEXT, description_value TEXT, description_currency TEXT, fee_currency TEXT, fee_value TEXT, fee_label TEXT, fee_display TEXT, status_display TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 37) {
            sQLiteDatabase.r(" CREATE TABLE online_payment (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT NOT NULL, code TEXT, category TEXT, link TEXT, maintenance TEXT, background_url TEXT, icon_url TEXT, logo_url TEXT, priority INTEGER, tags TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 38) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS user_activity", null);
            sQLiteDatabase.r("CREATE TABLE user_activity (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, type TEXT, method TEXT, status TEXT, timestamp TEXT, display TEXT, description_action TEXT, description_target TEXT, description_value TEXT, description_currency TEXT, fee_currency TEXT, fee_value TEXT, fee_label TEXT, fee_display TEXT, status_display TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 39) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS voucher", null);
            sQLiteDatabase.r("CREATE TABLE voucher (_id INTEGER PRIMARY KEY AUTOINCREMENT, assignment_id INTEGER, account_name TEXT, campaign_name TEXT, code TEXT NOT NULL, sender TEXT, recipient TEXT, status TEXT, start_date TEXT, end_date TEXT, icon_url TEXT, banner_url TEXT, faq TEXT, mechanics TEXT, external_partner_code TEXT, denomination_type TEXT, denomination_value DECIMAL, page INTEGER, notification_dates_expiry TEXT, notification_type TEXT, notification_spiel TEXT, has_reminder INTEGER, redeemed_date TEXT, UNIQUE (assignment_id)ON CONFLICT REPLACE )", null);
            sQLiteDatabase.r("CREATE TABLE voucher_reminder (_id INTEGER PRIMARY KEY AUTOINCREMENT, id INTEGER NOT NULL, has_reminder INTEGER, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 40) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS user_activity", null);
            sQLiteDatabase.r("CREATE TABLE user_activity (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, type TEXT, method TEXT, status TEXT, timestamp TEXT, display TEXT, description_action TEXT, description_target TEXT, description_value TEXT, description_currency TEXT, fee_currency TEXT, fee_value TEXT, fee_label TEXT, fee_display TEXT, status_display TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 41) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS online_payment", null);
            sQLiteDatabase.r(" CREATE TABLE online_payment (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT NOT NULL, code TEXT, category TEXT, link TEXT, maintenance TEXT, background_url TEXT, icon_url TEXT, logo_url TEXT, priority INTEGER, tags TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 42) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS load_up_partner", null);
            sQLiteDatabase.r("CREATE TABLE load_up_partner (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT, subtitle TEXT, type TEXT, limit_min_currency TEXT, limit_min_value TEXT, limit_max_currency TEXT, limit_max_value TEXT, maintenance_start TEXT, maintenance_end TEXT, maintenance_message TEXT, icon_url_xhdpi TEXT, icon_url_hdpi TEXT, icon_url_mdpi TEXT, steps TEXT, channel TEXT, slug TEXT, no_fee_display INTEGER, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 43) {
            sQLiteDatabase.r("CREATE TABLE shop_purchase_history (_id INTEGER PRIMARY KEY AUTOINCREMENT, product_id TEXT, product_name TEXT, product_description TEXT, image_url TEXT, icon_url TEXT, recipient TEXT, status TEXT, created_at TEXT, updated_at TEXT, payment_trn TEXT, order_reference_number TEXT, price DECIMAL, page INTEGER, code TEXT, network TEXT, other_fields TEXT, gifted INTEGER, with_receipt INTEGER, available_receipt INTEGER, UNIQUE (order_reference_number) ON CONFLICT REPLACE )", null);
        }
        if (i < 44) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS load_up_partner", null);
            sQLiteDatabase.r("CREATE TABLE load_up_partner (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT, subtitle TEXT, type TEXT, limit_min_currency TEXT, limit_min_value TEXT, limit_max_currency TEXT, limit_max_value TEXT, maintenance_start TEXT, maintenance_end TEXT, maintenance_message TEXT, icon_url_xhdpi TEXT, icon_url_hdpi TEXT, icon_url_mdpi TEXT, steps TEXT, channel TEXT, slug TEXT, no_fee_display INTEGER, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 45) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS shop_purchase_history", null);
            sQLiteDatabase.r("CREATE TABLE shop_purchase_history (_id INTEGER PRIMARY KEY AUTOINCREMENT, product_id TEXT, product_name TEXT, product_description TEXT, image_url TEXT, icon_url TEXT, recipient TEXT, status TEXT, created_at TEXT, updated_at TEXT, payment_trn TEXT, order_reference_number TEXT, price DECIMAL, page INTEGER, code TEXT, network TEXT, other_fields TEXT, gifted INTEGER, with_receipt INTEGER, available_receipt INTEGER, UNIQUE (order_reference_number) ON CONFLICT REPLACE )", null);
        }
        if (i < 46) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS voucher", null);
            sQLiteDatabase.r("CREATE TABLE voucher (_id INTEGER PRIMARY KEY AUTOINCREMENT, assignment_id INTEGER, account_name TEXT, campaign_name TEXT, code TEXT NOT NULL, sender TEXT, recipient TEXT, status TEXT, start_date TEXT, end_date TEXT, icon_url TEXT, banner_url TEXT, faq TEXT, mechanics TEXT, external_partner_code TEXT, denomination_type TEXT, denomination_value DECIMAL, page INTEGER, notification_dates_expiry TEXT, notification_type TEXT, notification_spiel TEXT, has_reminder INTEGER, redeemed_date TEXT, UNIQUE (assignment_id)ON CONFLICT REPLACE )", null);
        }
        if (i < 47) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS shop_purchase_history", null);
            sQLiteDatabase.r("CREATE TABLE shop_purchase_history (_id INTEGER PRIMARY KEY AUTOINCREMENT, product_id TEXT, product_name TEXT, product_description TEXT, image_url TEXT, icon_url TEXT, recipient TEXT, status TEXT, created_at TEXT, updated_at TEXT, payment_trn TEXT, order_reference_number TEXT, price DECIMAL, page INTEGER, code TEXT, network TEXT, other_fields TEXT, gifted INTEGER, with_receipt INTEGER, available_receipt INTEGER, UNIQUE (order_reference_number) ON CONFLICT REPLACE )", null);
        }
        if (i < 48) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS load_up_partner", null);
            sQLiteDatabase.r("CREATE TABLE load_up_partner (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT, subtitle TEXT, type TEXT, limit_min_currency TEXT, limit_min_value TEXT, limit_max_currency TEXT, limit_max_value TEXT, maintenance_start TEXT, maintenance_end TEXT, maintenance_message TEXT, icon_url_xhdpi TEXT, icon_url_hdpi TEXT, icon_url_mdpi TEXT, steps TEXT, channel TEXT, slug TEXT, no_fee_display INTEGER, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 49) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS online_payment", null);
            sQLiteDatabase.r(" CREATE TABLE online_payment (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT NOT NULL, code TEXT, category TEXT, link TEXT, maintenance TEXT, background_url TEXT, icon_url TEXT, logo_url TEXT, priority INTEGER, tags TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 50) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS voucher", null);
            sQLiteDatabase.r("CREATE TABLE voucher (_id INTEGER PRIMARY KEY AUTOINCREMENT, assignment_id INTEGER, account_name TEXT, campaign_name TEXT, code TEXT NOT NULL, sender TEXT, recipient TEXT, status TEXT, start_date TEXT, end_date TEXT, icon_url TEXT, banner_url TEXT, faq TEXT, mechanics TEXT, external_partner_code TEXT, denomination_type TEXT, denomination_value DECIMAL, page INTEGER, notification_dates_expiry TEXT, notification_type TEXT, notification_spiel TEXT, has_reminder INTEGER, redeemed_date TEXT, UNIQUE (assignment_id)ON CONFLICT REPLACE )", null);
        }
        if (i < 51) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS shop_purchase_history", null);
            sQLiteDatabase.r("CREATE TABLE shop_purchase_history (_id INTEGER PRIMARY KEY AUTOINCREMENT, product_id TEXT, product_name TEXT, product_description TEXT, image_url TEXT, icon_url TEXT, recipient TEXT, status TEXT, created_at TEXT, updated_at TEXT, payment_trn TEXT, order_reference_number TEXT, price DECIMAL, page INTEGER, code TEXT, network TEXT, other_fields TEXT, gifted INTEGER, with_receipt INTEGER, available_receipt INTEGER, UNIQUE (order_reference_number) ON CONFLICT REPLACE )", null);
        }
        if (i < 52) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS shop_category", null);
            sQLiteDatabase.r("CREATE TABLE shop_category (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT, code TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
            sQLiteDatabase.r("DROP TABLE IF EXISTS product_type", null);
            sQLiteDatabase.r("CREATE TABLE product_type (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, category_id TEXT, name TEXT, code TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
            sQLiteDatabase.r("DROP TABLE IF EXISTS product_v2", null);
            sQLiteDatabase.r("CREATE TABLE product_v2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT, product_type TEXT, shop_categories TEXT, image_url TEXT, icon_url TEXT, description TEXT, product_code TEXT, original_currency TEXT, original_value TEXT, discounted_currency TEXT, discounted_value TEXT, promo INTEGER, category TEXT, network TEXT, priority INTEGER, page INTEGER, disabled INTEGER, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 53) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS decoration", null);
            sQLiteDatabase.r(" CREATE TABLE decoration (_id INTEGER PRIMARY KEY AUTOINCREMENT, created_at TEXT, updated_at TEXT, id TEXT NOT NULL, category TEXT, label TEXT, description TEXT, iconUrl TEXT, imageUrl TEXT, priority INTEGER, hidden INTEGER, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 54) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS product_v3", null);
            sQLiteDatabase.r("CREATE TABLE product_v3 (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT, product_type TEXT, provider TEXT, shop_categories TEXT, logo_url TEXT, icon_url TEXT, description TEXT, product_code TEXT, original_currency TEXT, original_value DECIMAL, discounted_currency TEXT, discounted_value DECIMAL, promo INTEGER, category TEXT, network TEXT, priority INTEGER, page INTEGER, disabled INTEGER, provider_details TEXT, provider_display_name TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 55) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS shop_provider", null);
            sQLiteDatabase.r("CREATE TABLE shop_provider (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT NOT NULL, display_name TEXT NOT NULL, description TEXT NOT NULL, network TEXT, priority INTEGER, categories TEXT, created_at TEXT NOT NULL, updated_at TEXT NOT NULL, logo_url TEXT, icon_url TEXT, background_url TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 56) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS shop_provider", null);
            sQLiteDatabase.r("CREATE TABLE shop_provider (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT NOT NULL, display_name TEXT NOT NULL, description TEXT NOT NULL, network TEXT, priority INTEGER, categories TEXT, created_at TEXT NOT NULL, updated_at TEXT NOT NULL, logo_url TEXT, icon_url TEXT, background_url TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 57) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS decoration", null);
            sQLiteDatabase.r(" CREATE TABLE decoration (_id INTEGER PRIMARY KEY AUTOINCREMENT, created_at TEXT, updated_at TEXT, id TEXT NOT NULL, category TEXT, label TEXT, description TEXT, iconUrl TEXT, imageUrl TEXT, priority INTEGER, hidden INTEGER, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 58) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS online_payment", null);
            sQLiteDatabase.r(" CREATE TABLE online_payment (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT NOT NULL, code TEXT, category TEXT, link TEXT, maintenance TEXT, background_url TEXT, icon_url TEXT, logo_url TEXT, priority INTEGER, tags TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 59) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS shop_provider", null);
            sQLiteDatabase.r("CREATE TABLE shop_provider (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT NOT NULL, display_name TEXT NOT NULL, description TEXT NOT NULL, network TEXT, priority INTEGER, categories TEXT, created_at TEXT NOT NULL, updated_at TEXT NOT NULL, logo_url TEXT, icon_url TEXT, background_url TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 60) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS biller", null);
            sQLiteDatabase.r(" CREATE TABLE biller (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, slug TEXT, category TEXT, categorySlug TEXT, listUrl TEXT, iconUrl TEXT, confirmationUrl TEXT, accountNumberPlaceholder TEXT, amountPlaceholder TEXT, UNIQUE (slug) ON CONFLICT REPLACE)", null);
        }
        if (i < 61) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS product_v3", null);
            sQLiteDatabase.r("CREATE TABLE product_v3 (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT, product_type TEXT, provider TEXT, shop_categories TEXT, logo_url TEXT, icon_url TEXT, description TEXT, product_code TEXT, original_currency TEXT, original_value DECIMAL, discounted_currency TEXT, discounted_value DECIMAL, promo INTEGER, category TEXT, network TEXT, priority INTEGER, page INTEGER, disabled INTEGER, provider_details TEXT, provider_display_name TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 62) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS bank", null);
            sQLiteDatabase.r("CREATE TABLE bank (_id INTEGER PRIMARY KEY AUTOINCREMENT, bank_code TEXT NOT NULL, bank_name TEXT NOT NULL, is_active INTEGER, is_maintenance INTEGER, fee TEXT, bank_ic TEXT, UNIQUE (bank_code) ON CONFLICT REPLACE)", null);
        }
        if (i < 63) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS shop_provider", null);
            sQLiteDatabase.r("CREATE TABLE shop_provider (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT NOT NULL, display_name TEXT NOT NULL, description TEXT NOT NULL, network TEXT, priority INTEGER, categories TEXT, created_at TEXT NOT NULL, updated_at TEXT NOT NULL, logo_url TEXT, icon_url TEXT, background_url TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
        if (i < 64) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS credit_transaction", null);
            sQLiteDatabase.r("CREATE TABLE credit_transaction (_id INTEGER PRIMARY KEY AUTOINCREMENT, accountId TEXT , transactionId TEXT NOT NULL, transactionReference TEXT, totalAmount TEXT, currency TEXT, transactionType TEXT, action TEXT, target TEXT, dateTime TEXT, UNIQUE (transactionId) ON CONFLICT REPLACE)", null);
        }
        if (i < 65) {
            str2 = "DROP TABLE IF EXISTS biller_v2";
            sQLiteDatabase.r(str2, null);
            str = " CREATE TABLE biller_v2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, slug TEXT, category TEXT, categorySlug TEXT, active INTEGER, listUrl TEXT, iconUrl TEXT, confirmationUrl TEXT, hasOtherCharges INTEGER, paymentMethods TEXT, UNIQUE (slug) ON CONFLICT REPLACE)";
            sQLiteDatabase.r(str, null);
        } else {
            str = " CREATE TABLE biller_v2 (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, slug TEXT, category TEXT, categorySlug TEXT, active INTEGER, listUrl TEXT, iconUrl TEXT, confirmationUrl TEXT, hasOtherCharges INTEGER, paymentMethods TEXT, UNIQUE (slug) ON CONFLICT REPLACE)";
            str2 = "DROP TABLE IF EXISTS biller_v2";
        }
        if (i < 66) {
            sQLiteDatabase.r(str2, null);
            sQLiteDatabase.r(str, null);
        }
        if (i < 67) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS voucher", null);
            sQLiteDatabase.r("CREATE TABLE voucher (_id INTEGER PRIMARY KEY AUTOINCREMENT, assignment_id INTEGER, account_name TEXT, campaign_name TEXT, code TEXT NOT NULL, sender TEXT, recipient TEXT, status TEXT, start_date TEXT, end_date TEXT, icon_url TEXT, banner_url TEXT, faq TEXT, mechanics TEXT, external_partner_code TEXT, denomination_type TEXT, denomination_value DECIMAL, page INTEGER, notification_dates_expiry TEXT, notification_type TEXT, notification_spiel TEXT, has_reminder INTEGER, redeemed_date TEXT, UNIQUE (assignment_id)ON CONFLICT REPLACE )", null);
        }
        if (i < 68) {
            sQLiteDatabase.r("DROP TABLE IF EXISTS product_v3", null);
            sQLiteDatabase.r("CREATE TABLE product_v3 (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT NOT NULL, name TEXT, product_type TEXT, provider TEXT, shop_categories TEXT, logo_url TEXT, icon_url TEXT, description TEXT, product_code TEXT, original_currency TEXT, original_value DECIMAL, discounted_currency TEXT, discounted_value DECIMAL, promo INTEGER, category TEXT, network TEXT, priority INTEGER, page INTEGER, disabled INTEGER, provider_details TEXT, provider_display_name TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
            sQLiteDatabase.r(" CREATE TABLE shop_provider_subcategory (_id INTEGER PRIMARY KEY AUTOINCREMENT, provider_name TEXT NOT NULL, id TEXT NOT NULL, name TEXT NOT NULL, code TEXT NOT NULL, priority INTEGER, UNIQUE (provider_name , id) ON CONFLICT REPLACE)", null);
        }
        if (i < 69) {
            sQLiteDatabase.r(str2, null);
            sQLiteDatabase.r(str, null);
        }
        if (i < 70) {
            sQLiteDatabase.r(" CREATE TABLE action_card_recommendation (_id INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT, title TEXT, subtitle TEXT, color TEXT, application_uri TEXT, media TEXT, UNIQUE (id) ON CONFLICT REPLACE)", null);
        }
    }
}
