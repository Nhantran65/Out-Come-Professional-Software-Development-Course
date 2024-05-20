import { useTranslation } from 'react-i18next';
import { Link } from 'react-router-dom';
import {
    ButtonLink,
    HomeWrapper,
    LinkToPage,
    Slogan,
    SubSlogan,
    SubWrapper1,
    SubWrapper2,
    SubWrapperContent,
    Wrapper,
} from './styles';
import { PATH_MAIN } from '@/routes/paths';

const Home = () => {
    const { t } = useTranslation(['Home']);

    return (
        <HomeWrapper>
             (
                <Wrapper>
                    <SubWrapper1>
                        <LinkToPage href="/">Home</LinkToPage>
                        <Slogan>Make a Doctor's appointment faster with Booking Care</Slogan>
                        <ButtonLink>
                            <Link to={PATH_MAIN.APPOINTMENT}>
                                {t('Book An Appointment')}
                            </Link>
                        </ButtonLink>
                    </SubWrapper1>
                    <SubWrapper2>
                        <SubSlogan>Doctor Information & Their Contact</SubSlogan>
                        <SubWrapperContent>
                            
                        </SubWrapperContent>
                        <ButtonLink>
                            <Link to={'http://localhost:5173/doctor'}>{t('View all doctors')}</Link>
                        </ButtonLink>
                    </SubWrapper2>
                </Wrapper>
            )
        </HomeWrapper>
    );
};

export default Home;
