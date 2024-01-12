# VIll8 Mobile Application
 ## Introduction
Vill8 is an Android app that bridges the gap between villages and universities. It facilitates collaborative community service initiatives and village development projects involving both lecturers and students. Universities seeking impactful service opportunities can leverage Vill 8 to identify villages needing support and tailor their projects for targeted progress.

## Screenshot
![Screenshot_20240112_233200.png](Screenshot_20240112_233200.png)
![Screenshot_20240112_233504.png](Screenshot_20240112_233504.png)
![Screenshot_20240112_233557.png](Screenshot_20240112_233557.png)

## TIM Spontan 
- Muhammad Amirul Bimantoro - Hacker
- Nurul Aprilia - Hustler
- Febiyani Nuralifa Paneo - Hipster
- Reynaldi Raditya Lakoro - Hipster

## API Documentation
## Register
- URL
    - /users
- Method
    - POST
- Request Body
    - email as string
    - password as string
    - namaDesa as string
    - alamatDesa as string
    - provinsi as string
    - kotaKabupaten as string
    - namaNarahubung as string
    - nomorTelepon as string
- Response
```json
{
    "status": "success",
    "message": "User berhasil ditambahkan",
    "data": {
        "userId": "user-Z4znuLTiw91iyg_e"
    }
}
```

## Login
- URL
    - /authentications
- Method
    - POST
- Request Body
    - email as string
    - password as string
- Response
```json
{
  "status": "success",
  "message": "Authentication berhasil ditambahkan",
  "data": {
    "accessToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6InVzZXItdEw1NHVNZENobXlsdGlUZyIsImlhdCI6MTcwNTA3NTk4N30.YJwNbVBBkowuTQJu8Hn4iQtP2fYQ_D72WLceXDInqD8",
    "refreshToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6InVzZXItdEw1NHVNZENobXlsdGlUZyIsImlhdCI6MTcwNTA3NTk4N30.YJwNbVBBkowuTQJu8Hn4iQtP2fYQ_D72WLceXDInqD8"
  }
}
```