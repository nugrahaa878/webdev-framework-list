package com.nugrahaa.myframework

object FrameworksData {
    private val frameworksNames = arrayOf(
        "Spring",
        "Vue",
        "Node JS",
        "Django",
        "React",
        "Flutter",
        "Rails",
        "Ember",
        "Laravel",
        "Angular"
    )

    private val frameworksDetails = arrayOf(
        "Framework Spring adalah framework open source berbasis Java yang menyediakan infrastrukur yang komprehensif dalam mengembangkan aplikasi Java dengan mudah dan cepat. Spring pertama kali ditulis dan dirilis oleh Rod Johnson dengan lisensi Apache 2.0 pada bulan Juni 2003. Spring akan membantu pembaca dalam pengembangan aplikasi dengan build yang sederhana, portable, cepat dan sistem berbasis JVM yang fleksibel.",
        "Vue.js adalah suatu librari Javascript yang digunakan untuk membangun antar muka sebuah website yang interaktif. Supaya lebih singkat, untuk selanjutnya Vue.js saya tulis Vue. Library dari Vue difokuskan hanya pada view layer dan sangat mudah diimplementasikan dan diintegrasikan dengan library lain ataupun juga dengan project yang sudah ada sebelumnya. Untuk mempelajari Vue ini setidaknya kita sudah mengerti dasar-dasar HTML, CSS dan juga Javascript.",
        "Node.js adalah perangkat lunak yang didesain untuk mengembangkan aplikasi berbasis web dan ditulis dalam sintaks bahasa pemrograman JavaScript. Bila selama ini kita mengenal JavaScript sebagai bahasa pemrograman yang berjalan di sisi client / browser saja, maka Node.js ada untuk melengkapi peran JavaScript sehingga bisa juga berlaku sebagai bahasa pemrograman yang berjalan di sisi server, seperti halnya PHP, Ruby, Perl, dan sebagainya",
        "Django adalah sebuah framework full-stack untuk membuat aplikasi web dengan bahasa pemrograman Python. Framework akan membantu kita membuat web lebih cepat, dibandingkan menulis kode dari nol.",
        "React Js adalah sebuah library JavaScript yang di buat oleh facebook. React bukanlah sebuah framework MVC. React adalah library yang bersifat composable user interface, yang artinya kita dapat membuat berbagai UI yang bisa kita bagi menjadi beberapa komponen.",
        "Flutter awalnya dibuat untuk memudahkan pembuatan UI pada aplikasi mobile. Tapi kini sudah semakin berkembang, Flutter tidak hanya untuk Android dan iOS, Flutter kini juga bisa digunakan untuk membuat aplikasi web dan desktop. Satu code base, bisa di-build ke berbagai platform",
        "Ruby on Rails atau sering disebut dengan Rails merupakan sebuah framework yang diciptakan dengan bahasa pemrogramman Ruby. Rails sendiri pertama kali dikembangkan oleh David Heinemeier Hansson, yaitu seorang programmer dan pembalap.",
        "Ember.js adalah JavaScript yang berbasis open source yang digunakan pada client-side yang dipakai untuk mengembangkan aplikasi web dan menggunakan pola arsitektur MVC (Model View Controller). Dalam Ember.js, route yang digunakan sebagai model, handlebar sebagai view dan kontroler manipulasi data model.",
        "Anda pasti tahu bahasa pemrograman PHP? Laravel adalah satu-satunya framework yang membantu Anda untuk memaksimalkan penggunaan PHP di dalam proses pengembangan website. PHP menjadi bahasa pemrograman yang sangat dinamis, tapi semenjak adanya Laravel, dia menjadi lebih powerful, cepat, aman, dan simpel. Setiap rilis versi terbaru, Laravel  selalu memunculkan teknologi baru di antara framework PHP lainnya.",
        "Angular JS adalah framework terstruktur untuk aplikasi web yang dinamis. Framework ini mendukung penggunaan HTML sebagai bahasa template Anda dan memberikan Anda keleluasan pada pengembangan sintak HTML untuk mengekpresikan komponen dari aplikasi Anda secara baik dan ringkas. Data binding dan dependency injection dapat mengeliminasi banyak kode yang harus Anda tulis. Semua ini dibebankan kepada web browser, membuatnya menjadi partner ideal dengan teknologi server."
    )

    private val frameworksImages = intArrayOf(
        R.drawable.spring,
        R.drawable.vue,
        R.drawable.nodejs,
        R.drawable.django,
        R.drawable.react,
        R.drawable.flutter,
        R.drawable.rails,
        R.drawable.ember,
        R.drawable.laravel,
        R.drawable.angular
    )

    private val frameworksCourse = arrayOf(
        "https://www.youtube.com/watch?v=WQiKCpSYIJo&list=PLTfXGdzZLNtPFEiDwSt5qqAILfyy1s-DV",
        "https://www.youtube.com/watch?v=EmCBOtkXxdg&list=PLCZlgfAG0GXCFeOD_wBc9GrYF9pA8loLQ",
        "https://www.youtube.com/watch?v=cVvE2e3NgR0&list=PLCp66g_nYHAYjCPll38RaFzHSAQ5MTx_u",
        "https://www.youtube.com/watch?v=hPXNP1NoVNQ&list=PLZS-MHyEIRo6p_RwsWntxMO5QAqIHHHld",
        "https://www.youtube.com/watch?v=5kHyviqjhCk&list=PLU4DS8KR-LJ03qEsHn9zV4qdhcWtusBqb",
        "https://www.youtube.com/watch?v=sEbL9bXKI1g&list=PLZQbl9Jhl-VACm40h5t6QMDB92WlopQmV",
        "https://www.youtube.com/watch?v=vykkCnPAiJI&list=PLCZlgfAG0GXDx2lN_PuWEfPM26YFcEJHI",
        "https://www.youtube.com/watch?v=Ie-rWifNLkY&list=PL-lxoPS_1OXWBn3h1mNyX2ZVGYsn5-akf",
        "https://www.youtube.com/watch?v=-82XvDLsGKc&list=PLRKMmwY3-5MzQzlYKzc9-zymaCXaRfwOF",
        "https://www.youtube.com/watch?v=Zi4aAYYuuMc&list=PL-6LbU641p4jVYTZJb1MfMQwq4Wq249ov"
    )

    val listData: ArrayList<Framework>
        get() {
            val list = arrayListOf<Framework>()
            for (position in frameworksNames.indices) {
                val framework = Framework()
                framework.name = frameworksNames[position]
                framework.detail = frameworksDetails[position]
                framework.photo = frameworksImages[position]
                framework.linkCourse = frameworksCourse[position]
                list.add(framework)
            }
            return list
        }
}