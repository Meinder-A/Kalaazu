import Vue from "vue";
import VueRouter from "vue-router";
import External from "@/views/External.vue";
import Login from "@/components/external/Login.vue";
import Register from "@/components/external/Register.vue";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "external",
    component: External,
    children: [
      { path: "login", name: "login", component: Login },
      { path: "register", name: "register", component: Register }
    ]
  }
];

const router = new VueRouter({
  routes
});

export default router;
