package iosdevlog.com.onearticle.model

/**
 * Created by e on 2018/1/18.
 */

data class Article(
		val data: Data
)

data class Data(
		val date: Date,
		val author: String, //黑井千次
		val title: String, //神药
		val digest: String, //良子后悔当初不应该要孩子。但这样讲并不是说她从一开始就厌恶儿子。当医生告诉她怀孕时，心中顿时有一种不可思议的激动。她的妊娠反应比别人时间长，
		val content: String, //<p>良子后悔当初不应该要孩子。但这样讲并不是说她从一开始就厌恶儿子。</p><p>当医生告诉她怀孕时，心中顿时有一种不可思议的激动。她的妊娠反应比别人时间长，在这个胖乎乎的儿子出生的那天早晨，她紧紧握住丈夫的手，脸上露出满足的微笑。为了全力抚育这个儿子，他们夫妇商定不再生第二胎。</p><p>早在上幼儿园之前，她就教儿子认字、学钢琴、学游泳、喜爱花草。在孩子上小学的同时，她又把他送进补习学校、英语会话教室，还请了老师教他绘画。她希望把儿子培养成为一个兴趣广泛、聪明过人的美男子。</p><p>在儿子上小学四年级的时候，他被坏孩子引诱，到超级市场偷了一个红色洗脸盆，被当场抓住。</p><p>在五年级那年秋天，他和几个伙伴躲在厕所里吸雪茄烟，被老师发现。</p><p>六年级时开始喝酒，中午喝多了，在下午上课时大声唱歌，结果良子被叫到了学校。</p><p>他偷自行车、无证驾驶摩托车、在饭馆吃饭不付款就走、打架、骚扰女生，淋漓尽致地发挥了他这位小学生在这方面的所有才能，家长为此深为苦恼。</p><p>良子懊悔不已，早知道他这个样子，不生他有多好。她想，如果儿子不是一年年长大，叫人操心，而是一年年变小，成为一个可爱的婴儿该有多么幸福啊！</p><p>良子在电线杆上看到了一幅广告：敬告为孩子而苦恼的家长们。她按图索骥到了一家医院，对医生说：倘若这样继续下去，我也许会杀了他，我应该怎么办呢？</p><p>医生说，你放心吧，有一种神药已经问世，母亲早晚各吃一次，孩子一定会变小而且听话。医生边说边把用绿色胶囊裹着的药交给了良子。</p><p>这种药的疗效非常好。儿子一天比一天小，一天比一天可爱。良子欣喜若狂，一天晚上吃了两份药之后紧紧地抱着儿子睡着了。</p><p>半夜醒来，儿子不见了。她大吃一惊，急忙要起来，但发现肚子隆重起，身体沉重，行动不便。</p><p>这是怎么了？她感到惊惶，但又想，如果这种药对胎儿也有效，或许我还可以恢复婚前的身体，可以重新开始人生。她满怀希望地叫了一辆出租车赶到医院。</p><p>医生看着良子的肚子说：这种药现在已经禁止制造，所以没有了。</p><p>良子惊惶不安地说：那我怎么办？</p><p>医生平静地答道：三周后是预产期。</p>
		val wc: Int //827
)

data class Date(
		val curr: String, //20180118
		val prev: String, //20180117
		val next: String //20180119
)