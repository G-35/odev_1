# 📡 HTTP İstek Türleri ve Detayları

HTTP protokolü, sunucu ile istemci arasındaki iletişimi yönetmek için çeşitli **method (istem türleri)** kullanır. Bu doküman, temel HTTP methodlarını ve Java örneklerini açıklar.


## 🛠️ **HTTP Methodları**

### 1. `GET`

| **Özellik**       | **Açıklama**                                                                 |
|-------------------|-----------------------------------------------------------------------------|
| **Amaç**          | Sunucudan **veri okumak** için kullanılır.                                  |
| **Güvenli**       | ✅ (Sunucu durumunu değiştirmez)                                            |
| **Idempotent**    | ✅                                                                          |
| **Status Kodları**| `200 OK`, `404 Not Found`                                                   |
| **Örnek (Java)**  | ```java<br>URL url = new URL("https://api.example.com/users");<br>...```    |

### 2. `POST`

| **Özellik**       | **Açıklama**                                                                 |
|-------------------|-----------------------------------------------------------------------------|
| **Amaç**          | Sunucuya **yeni veri göndermek** (oluşturmak).                             |
| **Güvenli**       | ❌                                                                          |
| **Idempotent**    | ❌                                                                          |
| **Status Kodları**| `201 Created`                                                              |
| **Örnek (Java)**  | ```java<br>HttpClient client = HttpClient.newHttpClient();<br>...```       |

### 3. `PUT`

| **Özellik**       | **Açıklama**                                                                 |
|-------------------|-----------------------------------------------------------------------------|
| **Amaç**          | Var olan bir kaynağı **tamamen güncellemek**.                              |
| **Idempotent**    | ✅                                                                          |
| **Status Kodları**| `200 OK`, `204 No Content`                                                 |

### 4. `DELETE`

| **Özellik**       | **Açıklama**                                                                 |
|--------------------|-----------------------------------------------------------------------------|
| **Amaç**          | Sunucudan **veri silmek**.                                                 |
| **Idempotent**    | ✅                                                                          |
| **Status Kodları**| `200 OK`, `204 No Content`                                                 |


### 5. `PATCH`

- **Amaç:** Kaynağın **belirli kısımlarını güncellemek**.
- **Fark:** PUT'tan farklı olarak sadece değişen alanlar gönderilir.
- **Idempotent:** ⚠️ Garanti değil.

### 6. HEAD
💡 Not: GET isteğine benzer, ancak sadece başlıkları döndürür.

### 7. OPTIONS
- **Amaç:** Bir endpoint'in desteklediği methodları öğrenmek.
- **Örnek Çıktı:** `Allow: GET, POST, HEAD`.


### 8. HttpURLConnection
- **Amaç:** İstemci ile hedef sunucu arasında bir TCP tüneli oluşturmak.
- **Kullanım Alanı:** Genellikle proxy sunucular aracılığıyla güvenli bağlantılar (VPN, HTTPS tünelleme) kurmak için kullanılır.


### 9. TRACE
- **Amaç:** İstek mesajının sunucuya ulaşmadan önce, aradaki yolun (proxy, gateway) izlenebilmesi için geri döndürülmesini sağlamak.
- **Kullanım Alanı:** Hata ayıklama ve istek iletilerinin kontrolü amacıyla kullanılır.



📌 Önemli Kavramlar

Term			Açıklama
Idempotent		Aynı isteğin tekrarı aynı sonucu verir (GET, PUT, DELETE).
Güvenli			Sunucu durumunu değiştirmeyen methodlar (GET, HEAD, OPTIONS).


📚 Java Kütüphaneleri

HttpURLConnection		(JDK ile gelir)
Apache newHttpClient	(Gelişmiş özellikler)
Java 11+ newHttpClient	(Modern ve asenkron destekli)
