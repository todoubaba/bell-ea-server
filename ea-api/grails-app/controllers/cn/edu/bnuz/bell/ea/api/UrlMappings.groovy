package cn.edu.bnuz.bell.ea.api

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: 'application', action:'index')
        "500"(view: '/application/serverError')
        "404"(view: '/application/notFound')
    }
}
