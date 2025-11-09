import React, { useEffect, useState } from 'react';
import './app.css'; // Asegúrate de que el CSS esté en la misma carpeta o ajusta la ruta
import { FaFacebookF, FaTwitter, FaInstagram, FaLinkedinIn, FaArrowUp } from 'react-icons/fa';



const heroBg = 'https://picsum.photos/1920/1080?gravity=center&blur=2&random=1'; 

const aboutUsImg = 'https://i.ytimg.com/vi/WwWuPuQkXR4/hq720.jpg?sqp=-oaymwEhCK4FEIIDSFryq4qpAxMIARUAAAAAGAElAADIQj0AgKJD&rs=AOn4CLA0Mzi-C2OGPuYw5oNDXK76ztMCsg';

const car1 = 'https://media.revistagq.com/photos/63adc8481e3c45108e2fdbab/16:9/w_2560%2Cc_limit/1199036835'; 
const car2 = 'https://motor.elpais.com/wp-content/uploads/2016/11/mini-vision-next-100-concept-1.jpg'; 
const car3 = 'https://motor.elpais.com/wp-content/uploads/2016/11/bmw-vision-next-100-concept-1.jpg'; 

const App = () => {
    const [showScrollToTop, setShowScrollToTop] = useState(false);

    useEffect(() => {
        const handleScroll = () => {
            if (window.scrollY > 300) {
                setShowScrollToTop(true);
            } else {
                setShowScrollToTop(false);
            }
        };

        window.addEventListener('scroll', handleScroll);
        return () => window.removeEventListener('scroll', handleScroll);
    }, []);

    const scrollToTop = () => {
        window.scrollTo({
            top: 0,
            behavior: 'smooth'
        });
    };

    // Función para generar estrellas aleatorias en el fondo
    useEffect(() => {
        const starsContainer = document.querySelector('.stars');
        const numStars = 100; // Ajusta la cantidad de estrellas

        if (starsContainer) { // Asegúrate de que el contenedor exista antes de añadir estrellas
            for (let i = 0; i < numStars; i++) {
                const star = document.createElement('div');
                star.classList.add('star');
                star.style.top = `${Math.random() * 100}%`;
                star.style.left = `${Math.random() * 100}%`;
                star.style.width = `${Math.random() * 3 + 1}px`;
                star.style.height = star.style.width;
                star.style.animationDelay = `${Math.random() * 5}s`;
                star.style.animationDuration = `${Math.random() * 5 + 3}s`;
                starsContainer.appendChild(star);
            }
        }
    }, []);

    return (
        <div className="App">
            <div className="stars"></div> {/* Contenedor para las estrellas */}

            <header>
                <nav className="navbar">
                    <a href="#hero" className="logo">Galaxy<span>Motors</span></a>
                    <ul className="nav-links">
                        <li><a href="#about">Nosotros</a></li>
                        <li><a href="#featured">Vehículos</a></li>
                        <li><a href="#contact">Contacto</a></li>
                    </ul>
                </nav>
            </header>

            <section id="hero" className="hero-section">
                <img src={heroBg} alt="Fondo Intergaláctico" className="hero-bg" />
                <div className="hero-content">
                    <h1>Bienvenido a GalaxyMotors</h1>
                    <p>Experimenta el lujo y la innovación con nuestra colección de vehículos que desafían las estrellas.</p>
                    <a href="#featured" className="cta-button">Ver Vehículos</a>
                </div>
            </section>

            <section id="about" className="section about-us-section">
                <h2>Nuestra Misión Intergaláctica</h2>
                <div className="about-us-content">
                    <div>
                        <p>En GalaxyMotors, no solo vendemos coches, ofrecemos portales a nuevas experiencias. Nuestra visión es llevar la excelencia automotriz más allá de los límites terrestres, combinando diseño vanguardista, tecnología de punta y un servicio inigualable.</p>
                        <p>Desde nuestra fundación, nos hemos dedicado a curar una selección exclusiva de vehículos que encarnan la sofisticación, el rendimiento y la visión de futuro. Cada automóvil en nuestro concesionario es una obra de arte, lista para despegar contigo hacia tu próximo destino, ya sea en la Tierra o más allá.</p>
                    </div>
                    <div className="about-us-image">
                        <img src={aboutUsImg} alt="Coche de lujo en showroom" />
                    </div>
                </div>
            </section>

            <section id="featured" className="section featured-cars-section">
                <h2>Vehículos Estelares Destacados</h2>
                <div className="featured-cars-grid">
                    <div className="car-card">
                        <img src={car1} alt="Carro Deportivo Elara" />
                        <div className="car-info">
                            <h3>Elara GT</h3>
                            <p>Velocidad que desafía la gravedad, diseño futurista y rendimiento inigualable para el aventurero cósmico.</p>
                            <p className="car-price">Desde $250,000</p>
                            <a href="#contact" className="car-cta">Más Información</a>
                        </div>
                    </div>

                    <div className="car-card">
                        <img src={car2} alt="SUV Lunar Voyager" />
                        <div className="car-info">
                            <h3>Lunar Voyager SUV</h3>
                            <p>Explora cualquier terreno, desde desiertos terrestres hasta paisajes lunares, con el máximo confort y estilo.</p>
                            <p className="car-price">Desde $180,000</p>
                            <a href="#contact" className="car-cta">Más Información</a>
                        </div>
                    </div>

                    <div className="car-card">
                        <img src={car3} alt="Sedán interestelar Nebula" />
                        <div className="car-info">
                            <h3>Nebula X-Class</h3>
                            <p>Elegancia interestelar redefinida. Un sedán de lujo con tecnología híbrida y una presencia imponente.</p>
                            <p className="car-price">Desde $195,000</p>
                            <a href="#contact" className="car-cta">Más Información</a>
                        </div>
                    </div>
                </div>
            </section>

            <section id="contact" className="section contact-section">
                <h2>Contacta con Nuestra Flota</h2>
                <div className="contact-form-container">
                    <form className="contact-form">
                        <div className="form-group">
                            <label htmlFor="name">Nombre Completo</label>
                            <input type="text" id="name" name="name" required />
                        </div>
                        <div className="form-group">
                            <label htmlFor="email">Correo Electrónico</label>
                            <input type="email" id="email" name="email" required />
                        </div>
                        <div className="form-group">
                            <label htmlFor="phone">Número de Teléfono</label>
                            <input type="tel" id="phone" name="phone" />
                        </div>
                        <div className="form-group">
                            <label htmlFor="interest">Vehículo de Interés</label>
                            <input type="text" id="interest" name="interest" placeholder="Ej: Elara GT" />
                        </div>
                        <div className="form-group full-width">
                            <label htmlFor="message">Tu Mensaje</label>
                            <textarea id="message" name="message" rows="5" required></textarea>
                        </div>
                        <button type="submit">Enviar Mensaje Cósmico</button>
                    </form>
                </div>
            </section>

            <footer>
                <div className="footer-content">
                    <div className="footer-section about-us-footer">
                        <h3>GalaxyMotors</h3>
                        <p>Tu destino para el lujo automotriz que va más allá de lo ordinario.</p>
                        <div className="social-links">
                            <a href="https://facebook.com" target="_blank" rel="noopener noreferrer"><FaFacebookF /></a>
                            <a href="https://twitter.com" target="_blank" rel="noopener noreferrer"><FaTwitter /></a>
                            <a href="https://instagram.com" target="_blank" rel="noopener noreferrer"><FaInstagram /></a>
                            <a href="https://linkedin.com" target="_blank" rel="noopener noreferrer"><FaLinkedinIn /></a>
                        </div>
                    </div>
                    <div className="footer-section quick-links">
                        <h3>Enlaces Rápidos</h3>
                        <ul>
                            <li><a href="#about">Nosotros</a></li>
                            <li><a href="#featured">Vehículos</a></li>
                            <li><a href="#">Servicios</a></li>
                            <li><a href="#">Política de Privacidad</a></li>
                        </ul>
                    </div>
                    <div className="footer-section contact-info">
                        <h3>Contacto</h3>
                        <p>📍 Vía Láctea, Sector 7G, Galaxia Z-9</p>
                        <p>📞 +1 (555) GALAXYC</p>
                        <p>📧 info@galaxymotors.com</p>
                    </div>
                </div>
                <div className="footer-bottom">
                    &copy; {new Date().getFullYear()} GalaxyMotors. Todos los derechos reservados. Impulsado por la visión del futuro.
                </div>
            </footer>

            <a href="#" className={`scroll-to-top ${showScrollToTop ? 'show' : ''}`} onClick={scrollToTop}>
                <FaArrowUp />
            </a>
        </div>
    );
}

export default App;