# کاربرد عملی الگوهای طراحی شئ‌گرا (Object Oriented Design Patterns) 
در این مخزن یک سیستم ارسال محصول برای استفاده از طراحی‌های شئ‌گرا به صورت TDD توسعه یافته است.

##  پرسش ها
### پرسش ۱
در کتاب GoF سه دسته الگوی طراحی معرفی شده است. آن‌ها را نام ببرید و در مورد هر دسته در حد دو خط توضیح دهید.
#### پاسخ:
سه دسته الگو در این کتاب وجود دارد، الگوهای ایجادی(Creational Patterns)، الگو‌های ساختاری (Structural Patterns)، و الگو‌های رفتاری (Behavioral Patterns).
<br/>
دسته اول الگوهای ایجادی(Creational Patterns):
<br/>
هدف این دسته الگو‌های طراحی‌، ایجاد مکانیزم‌های ساخت شی ایست که در نتیجه آن بتوان ساخت شی را به صورت reusable و منعطف انجام داد. به طور مثال Singleton یک نمونه از الگوی Creational  است که باعث می‌شود از یک کلاس فقط یک شی ایجاد شود. از این الگو برای ساختن درگاه های ارتباطی با پایگاه‌داده‌ها (یا به طور کلی منابع مشترک) استفاده می‌شود. مثال دیگر از گروه الگوی Creational الگوی factory است که در آن یک کلاس سازنده تعریف می‌شود که بر اساس ورودی‌ها و شرایط مورد نیاز برنامه شی های متفاوت می‌سازد. 
<br/>
دسته دوم الگوهای ساختاری(Structural Patterns):
<br/>
الگوهای ساختاری روش‌هایی برای سازماندهی اشیا و کلاس‌ها ارائه می‌دهند تا این موارد بتوانند با هم به صورت انعطاف پذیر و بهینه کار کنند و سیستم‌های بزرگتر و پیچیده‌تر را تشکیل دهند. منظور از انعطاف پذیر و بهینه بودن، کم شدن هدر رفت منابع و سازگاری با تغییرات است. یک مثال از این دسته الگوی Proxy است که در مسیر ارتباط دو شی قرار می‌گیرد و می‌توان بدون ایجاد تغییر در شی‌های دیگر کاربرد هایی مثل caching یا logging را بین مسیر اضافه کرد.
<br/>
دسته سوم الگوهای رفتاری (Behavioral Patterns):
<br/>
این دسته از الگو‌ها، همانطور که از نامشان پیداست، بر رفتار و تعامل بین اشیاء مختلف در یک سیستم تمرکز دارند. الگو‌های رفتاری با الگوریتم‌ها و توزیع مسئولیت‌ها بین اشیا سر و کار دارند. الگو‌های State و Strategy که در این مخزن مورد استفاده قرار گرفته‌اند عضو دسته الگو‌های رفتاری هستند. 


### پرسش ۲
الگوهای استفاده شده در این آزمایش جزو کدام دسته هستند؟

### پاسخ:
الگو‌های State و Strategy که در این مخزن مورد استفاده قرار گرفته‌اند عضو دسته الگو‌های رفتاری هستند. 

### پرسش ۳
با توجه به این که در هر اجرا محصرا یک بسته داریم و هیچ بسته‌ی دیگری بجز آن نداریم، کدام الگوی طراحی را برای ایحاد آن مناسب می‌دانید؟ ضمن بیان علت انتخاب خود، نحوه تحقق الگو را به طور کامل توضیح دهید.
### پاسخ:

### پرسش ۴
تحقق و یا عدم تحقق هر کدام از اصول SOLID را در خصوص الگوی طراحی Singleton بیان کنید (هرکدام حداکثر در سه خط).
### پاسخ:
