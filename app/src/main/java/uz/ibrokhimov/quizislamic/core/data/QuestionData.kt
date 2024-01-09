package uz.ibrokhimov.quizislamic.core.data

import uz.ibrokhimov.quizislamic.core.model.SavolModel

class QuestionData {



    companion object {
        private val data = getAllData()

        private fun getAllData(): ArrayList<SavolModel> {
            val data = ArrayList<SavolModel>()
            data!!.add(
                SavolModel(
                    0, "Islom dinining uchinchi ustuni nima?", arrayListOf<String>(
                        "Farzand tarbiyasi", "Ilm olish", "Ro'za", "ota-onaga yaxshilik"
                    ), "Ro'za"
                )
            )

            data!!.add(
                SavolModel(
                    1,
                    "Mehr berish shartmi?",
                    arrayListOf("Ixtiyoriy", "Umr mobaynida berish farz", "Shart emas", "bida't"),
                    "Umr mobaynida berish farz"
                )
            )

            data!!.add(
                SavolModel(
                    2,
                    "Payg'ambarimiz Muhammad (sollallohu alayhu vasallam) nimani \"U dunyoda bu dunyo ovqatlarining oliysi\" deb ataganlar?",
                    arrayListOf<String>(
                        "Sut", "Xurmo", "Non", "Go'sht"
                    ),
                    "Go'sht"
                )
            )

            data!!.add(
                SavolModel(
                    3, "Allohning ismi nechta?", arrayListOf<String>(
                        "77", "56", "99", "88"
                    ), "99"
                )
            )

            data.add(
                SavolModel(
                    4, "Payg'ambarimiz necha yoshlarida vafot etganlar?", arrayListOf<String>(
                        "67", "63", "57", "76"
                    ), "63"
                )
            )

            data.add(
                SavolModel(
                    4, "Payg'ambarimiz qayerda tug'ilgan?", arrayListOf<String>(
                        "Makka", "Madina", "Sofia", "Abu Dhabi"
                    ), "Makka"
                )
            )

            data.add(
                SavolModel(
                    4, "Payg'ambarimiz qayerda vafot etganlar?", arrayListOf<String>(
                        "Makka", "Madina", "Sofia", "Abu Dhabi"
                    ), "Madina"
                )
            )

            data.add(
                SavolModel(
                    4,
                    "Payg'ambarimiz Muhammad (s.a.v) necha yoshlarida Jabroil (a.s)dan vahiy tushgan?",
                    arrayListOf<String>(
                        "40", "30", "45", "35"
                    ),
                    "40"
                )
            )

            data.add(
                SavolModel(
                    7,
                    "Payg'ambarimiz Muhammad (s.a.v)ning necha yoshlarida onalari vafot etgan?",
                    arrayListOf<String>(
                        "9 yoshlarida", "6 yoshlarida", "3 yoshlarida", "12 yoshlarida"
                    ),
                    "6 yoshlarida"
                )
            )

            data.add(
                SavolModel(
                    8,
                    "Payg'ambarimiz Muhammad (s.a.v)ning necha yoshlarida otalari vafot etgan?",
                    arrayListOf<String>(
                        "9 yoshlarida", "Tug'ilmaslaridan oldin", "3 yoshlarida", "12 yoshlarida"
                    ),
                    "Tug'ilmaslaridan oldin"
                )
            )

            data.add(
                SavolModel(
                    9, "Quron qaysi suradan boshlanadi?", arrayListOf<String>(
                        "Fotiha", "Yasin", "Baqara", "Nas"
                    ), "Fotiha"
                )
            )

            data.add(
                SavolModel(
                    10, "Dajjolning qayerida nuqsoni bo'lgan?", arrayListOf<String>(
                        "Qulog'ida", "Ko'zida", "Qo'lida", "Yuzida"
                    ), "Ko'zida"
                )
            )

            data.add(
                SavolModel(
                    11, "Islom dinining beshinchi ustuni nima?", arrayListOf<String>(
                        "Yaxshi xulqi", "Uzun soqoli", "Bosh kiyimi", "Haj"
                    ), "Haj"
                )
            )

            data.add(
                SavolModel(
                    12, "Qaysi sahoba islomni birinchi bo'lib qabul qilgan?", arrayListOf<String>(
                        "Usmon (r.a)", "Umar (r.a)", "Ali (r.a)", "Holid (r.a)"
                    ), "Ali (r.a)"
                )
            )


            data.add(
                SavolModel(
                    13, "Islom dinini birinchi bo'lib qabul qilgan ayol?", arrayListOf<String>(
                        "Hadiycha onamiz", "Ruqiya onamiz", "Omina onamiz", "Oisha onamiz"
                    ), "Hadiycha onamiz"
                )
            )


            data.add(
                SavolModel(
                    14,
                    "Jabroil (a.s) Payg'ambarimiz Muhammad (s.a.v)ga yetkazish uchun Alloh Qur`onni qaysi tunda nozil qilgan?",
                    arrayListOf<String>(
                        "1001 kun", "Idul-fitr kuni", "Qurbon bayrami kechasi", "Laylat-ul-Qadr"
                    ),
                    "Laylat-ul-Qadr"
                )
            )


            data.add(
                SavolModel(
                    15, "Oisha onamiz kimning qizlari edi?", arrayListOf<String>(
                        "Usmon r.a", "Umar r.a", "Xolid ibn Valid r.a", "Abu Bakr r.a"
                    ), "Abu Bakr r.a"
                )
            )

            data.add(
                SavolModel(
                    16, "Badrdagi jangda kim g`olib bo`lgan?", arrayListOf<String>(
                        "Musulmonlar", "G`ayriddinlar", "Durang", "Tinchlik o`rnatildi"
                    ), "Musulmonlar"
                )
            )

            data.add(
                SavolModel(
                    17, "Qaysi payg`ambarga Zabur kitobi nozil bo`lgan?", arrayListOf<String>(
                        "Idris a.s ga", "Ayub a.s ga", "Yusuf a.s ga", "Dovud a.s ga"
                    ), "Dovud a.s ga"
                )
            )


            data.add(
                SavolModel(
                    18,
                    "Payg'ambarimiz Muhammad (s.a.v)ning uzuklari qanday metalldan edi?",
                    arrayListOf<String>(
                        "Oltindan", "Bronzadan", "Misdan", "Kumushdan"
                    ),
                    "Kumushdan"
                )
            )


            data.add(
                SavolModel(
                    19,
                    "Paygambarimiz Muhammad(s.a.v)ning otalari qazo etganlaridan so'ng kim birinchi bo'lib qarmog'iga olgan?",
                    arrayListOf<String>(
                        "Abut Tolib", "Adulmuttolib", "Abu Laxab", "Hamza r.a"
                    ),
                    "Adulmuttolib"
                )
            )


            data.add(
                SavolModel(
                    20,
                    "Paygambarimiz Muhammad(s.a.v)ning ikkinchi nevaralarining ismi nima edi?",
                    arrayListOf<String>(
                        "Hasan", "Husayn", "Abdulla", "Yuzida"
                    ),
                    "Husayn"
                )
            )

            data.add(
                SavolModel(
                    21, "Farishtalarning jinsi qanday?", arrayListOf<String>(
                        "Erkak", "Ayol", "Ular jinssiz", "Erkak va ayol"
                    ), "Ular jinssiz"
                )
            )


            data.add(
                SavolModel(
                    22,
                    "Quronda nechta sura bor?",
                    arrayListOf<String>(
                        "133", "155", "90", "114"
                    ),
                    "114"
                )
            )

            data.add(
                SavolModel(
                    23,
                    "Quronda nechta oyat bor?",
                    arrayListOf<String>(
                        "6666", "6236", "6446", "6789"
                    ),
                    "6236"
                )
            )

            data.add(
                SavolModel(
                    24,
                    "Quronda nechta sura bor?",
                    arrayListOf<String>(
                        "133", "155", "90", "114"
                    ),
                    "114"
                )
            )

            data.add(
                SavolModel(
                    25,
                    "Islom dini nechanchi yilda paydo bo'lgan?",
                    arrayListOf<String>(
                        "567", "619", "610", "615"
                    ),
                    "610"
                )
            )

            data.add(
                SavolModel(
                    26,
                    "Baqara surasi necha oyatdan iborat?",
                    arrayListOf<String>(
                        "300", "255", "270", "286"
                    ),
                    "286"
                )
            )

            data.add(
                SavolModel(
                    27,
                    "Quronda eng uzun oyat?",
                    arrayListOf<String>(
                        "Yasin surasi 25 oyat",
                        "Baqara surasi surasi 255 oyat",
                        "Baqara surasi surasi 244 oyat",
                        "Oliy imron surasi surasi 255 oyat"
                    ),
                    "Baqara surasi surasi 255 oyat"
                )
            )

            data.add(
                SavolModel(
                    28,
                    "Islom dinining ma'nosi nima?",
                    arrayListOf<String>(
                        "Iymon keltirish",
                        "Haqqa chorlash",
                        "Itoat qilish",
                        "Yagona Allohga bo'ysinish qilish"
                    ),
                    "Yagona Allohga bo'ysinish qilish"
                )
            )


            data.add(
                SavolModel(
                    29,
                    "Payg'ambarimiz Madinaga qachon hijrat qilganlar?",
                    arrayListOf<String>(
                        "622", "456", "780", "600"
                    ),
                    "622"
                )
            )

            data.add(
                SavolModel(
                    30,
                    "Tahoratda nechta farz bor?",
                    arrayListOf<String>(
                        "4 ta", "3 ta", "5 ta", "3 ta"
                    ),
                    "4 ta"
                )
            )


            data.add(
                SavolModel(
                    31,
                    "G'uslda nechta farz bor?",
                    arrayListOf<String>(
                        "2 ta", "4 ta", "5 ta", "3 ta"
                    ),
                    "3 ta"
                )
            )

            data.add(
                SavolModel(
                    32,
                    "Jabroil (a.s) payg'ambarimizga o'z qiyofasida ko'ringan?",
                    arrayListOf<String>(
                        "2 ta", "4 ta", "5 ta", "7 ta"
                    ),
                    "2 ta"
                )
            )

            data.add(
                SavolModel(
                    33,
                    "Payg'ambarimizning nechta ayollari bo'lgan?",
                    arrayListOf<String>(
                        "11 ta", "5 ta", "9 ta", "7 ta"
                    ),
                    "11 ta"
                )
            )


            data.add(
                SavolModel(
                    34,
                    "Payg'ambarimiz necha yoshlarida Hadiycha onamizga uylanganlar?",
                    arrayListOf<String>(
                        "40 yoshida", "20 yoshida", "25 yoshida", "26 yoshida"
                    ),
                    "25 yoshida"
                )
            )

            data.add(
                SavolModel(
                    35,
                    "Quroni karimda masjid so'zi necha marta zikr qilingan?",
                    arrayListOf<String>(
                        "25 marta", "18 marta", "26 marta", "27 marta"
                    ),
                    "27 marta"
                )
            )

            data.add(
                SavolModel(
                    36,
                    "Dunyoda nechta odam islom diniga e'tiqod qiladi?",
                    arrayListOf<String>(
                        "1.8 mlrdga ortiq", "1.5 mlrd dan ortiq", "3 mlrdan ortiq", "2 mlrdan ortiq"
                    ),
                    "1.8 mlrdga ortiq"
                )
            )


            data.add(
                SavolModel(
                    37,
                    "Quroni karimda masjid so'zi necha marta zikr qilingan?",
                    arrayListOf<String>(
                        "25 marta", "18 marta", "26 marta", "27 marta"
                    ),
                    "27 marta"
                )
            )

            data.add(
                SavolModel(
                    38,
                    "Islom tarixida birinchi marta Qiyos ilmini boshlab bergan shaxs kim?",
                    arrayListOf<String>(
                        "Umar ibn Hattob", "Abu Dardo", "Ahmad ibn Hanbal", "Abu Tolib"
                    ),
                    "Umar ibn Hattob"
                )
            )

            data.shuffle()
            return data
        }
        fun getData() = data
    }


}